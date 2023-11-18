package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.NotEnoughInformationException;
import com.extrawest.ocpi.exception.OcpiUnknownTokenException;
import com.extrawest.ocpi.model.dto.AuthorizationInfo;
import com.extrawest.ocpi.model.dto.LocationReferences;
import com.extrawest.ocpi.model.dto.token.Token;
import com.extrawest.ocpi.model.enums.AllowedType;
import com.extrawest.ocpi.model.enums.TokenType;
import com.extrawest.ocpi.service.EMSPTokenService;
import com.extrawest.ocpi221emsp_client.mapper.TokenMapper;
import com.extrawest.ocpi221emsp_client.model.TokenModel;
import com.extrawest.ocpi221emsp_client.repository.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EMSPTokenServiceImpl implements EMSPTokenService {
    @Autowired
    private final TokenRepository repository;
    @Autowired
    private final TokenMapper tokenMapper;
    @Autowired
    private final MongoTemplate mongoTemplate;

    @Override
    public List<Token> getToken(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        Query query = new Query();

        Criteria criteria = new Criteria();
        if (dateFrom != null) {
            criteria = Criteria.where("lastUpdated").gte(dateFrom);
        }
        if (dateTo != null) {
            criteria = criteria.lte(dateTo);
        }
        if (offset != null) {
            query.skip(offset);
        }
        if (limit != null) {
            query.limit(limit);
        }
        query.addCriteria(criteria);

        List<TokenModel> tokenModels = mongoTemplate.find(query, TokenModel.class);
        return tokenModels.stream().map(tokenMapper::toDto).collect(Collectors.toList());
    }


    public long getTotalCount(LocalDateTime dateFrom, LocalDateTime dateTo) {
        Query query = new Query();

        Criteria criteria = new Criteria();
        if (dateFrom != null) {
            criteria = Criteria.where("lastUpdated")
                    .gte(dateFrom);
        }
        if (dateTo != null) {
            criteria = criteria.lte(dateTo);
        }

        query.addCriteria(criteria);

        return mongoTemplate.count(query, TokenModel.class);
    }

    @Override
    public AuthorizationInfo postToken(String tokenUid, String tokenType, LocationReferences locationReferences) {
        if ((TokenType.RFID.value().equals(tokenType) || Strings.isBlank(tokenType)) && locationReferences == null) {
            throw new NotEnoughInformationException("To authorize RFID token please provide Location References");
        }
        Query query = new Query();

        Criteria criteria = Criteria.where("uid").is(tokenUid);
        if (Strings.isBlank(tokenType)) {
            TokenType type = TokenType.valueOf(tokenType);
            criteria = criteria.is(type);
        }
        query.addCriteria(criteria);
        TokenModel tokenModels = mongoTemplate.findOne(query, TokenModel.class);

        if (tokenModels == null) {
            if (Strings.isBlank(tokenType)) {
                throw new OcpiUnknownTokenException(String.format("Token uid = %s was not found", tokenUid));
            } else {
                throw new OcpiUnknownTokenException(String.format("Token uid = %s with type = %s was not found",
                        tokenUid, tokenType));
            }
        }

        //TODO:: implement authorization logic
        AuthorizationInfo authorizationInfo = new AuthorizationInfo();
        Token tokenDTO = tokenMapper.toDto(tokenModels);
        authorizationInfo.setToken(tokenDTO);
        if (locationReferences != null) {
            authorizationInfo.setLocation(locationReferences);
        }
        authorizationInfo.setAllowed(AllowedType.ALLOWED);
        return authorizationInfo;
    }
}
