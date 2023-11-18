package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.domain.CredentialsRole;
import com.extrawest.ocpi.model.dto.CredentialsDto;
import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = CredentialsRole.class)
public interface CredentialsMapper {
    CredentialsModel toModel(CredentialsDto dto);

    CredentialsDto toDto(CredentialsModel model);
}