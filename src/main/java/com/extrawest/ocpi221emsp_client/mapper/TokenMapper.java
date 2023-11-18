package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.token.Token;
import com.extrawest.ocpi221emsp_client.model.TokenModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface TokenMapper {
    TokenModel toModel(Token dto);

    Token toDto(TokenModel model);

    List<Token> toListDto(List<TokenModel> models);

    List<TokenModel> toListModel(List<Token> models);
}