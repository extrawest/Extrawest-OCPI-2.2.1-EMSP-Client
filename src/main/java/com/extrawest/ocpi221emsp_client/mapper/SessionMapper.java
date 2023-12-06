package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.ChargingPeriod;
import com.extrawest.ocpi.model.dto.SessionDto;
import com.extrawest.ocpi221emsp_client.model.SessionModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ChargingPeriod.class)
public interface SessionMapper {
    SessionModel toModel(SessionDto tariffDTO);

    SessionDto toDTO(SessionModel tariff);

    List<SessionDto> toListDTO(List<SessionModel> tariffs);

    List<SessionModel> toListModel(List<SessionDto> tariffs);
}
