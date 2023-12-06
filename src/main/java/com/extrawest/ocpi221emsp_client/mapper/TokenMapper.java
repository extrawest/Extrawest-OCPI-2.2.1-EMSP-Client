package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.token.TokenDto;
import com.extrawest.ocpi221emsp_client.model.TokenModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface TokenMapper {
    TokenModel toModel(TokenDto dto);

    TokenDto toDto(TokenModel model);

    List<TokenDto> toListDto(List<TokenModel> models);

    List<TokenModel> toListModel(List<TokenDto> models);
}