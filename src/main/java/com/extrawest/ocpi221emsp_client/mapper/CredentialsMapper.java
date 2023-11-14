package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.CredentialsDTO;
import com.extrawest.ocpi.model.vo.CredentialsRole;
import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = CredentialsRole.class)
public interface CredentialsMapper {
    CredentialsModel toModel(CredentialsDTO dto);

    CredentialsDTO toDto(CredentialsModel model);
}