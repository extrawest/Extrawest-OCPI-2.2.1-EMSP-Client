package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.Credentials;
import com.extrawest.ocpi.model.dto.CredentialsRole;
import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = CredentialsRole.class)
public interface CredentialsMapper {
    CredentialsModel toModel(Credentials dto);

    Credentials toDto(CredentialsModel model);
}