package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.ChargingPeriod;
import com.extrawest.ocpi.model.dto.Session;
import com.extrawest.ocpi221emsp_client.model.SessionModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ChargingPeriod.class)
public interface SessionMapper {
    SessionModel toModel(Session tariffDTO);

    Session toDTO(SessionModel tariff);

    List<Session> toListDTO(List<SessionModel> tariffs);

    List<SessionModel> toListModel(List<Session> tariffs);
}
