package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.TokenDTO;
import com.extrawest.ocpi221emsp_client.model.TokenModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface TokenMapper {
    TokenModel toModel(TokenDTO dto);
    TokenDTO toDto(TokenModel model);
    List<TokenDTO> toListDto(List<TokenModel> models);
    List<TokenModel> toListModel(List<TokenDTO> models);
}