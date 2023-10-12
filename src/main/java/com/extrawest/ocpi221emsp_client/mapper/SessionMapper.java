package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.SessionDTO;
import com.extrawest.ocpi.model.vo.ChargingPeriod;
import com.extrawest.ocpi221emsp_client.model.SessionModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ChargingPeriod.class)
public interface SessionMapper {
    SessionModel toModel(SessionDTO tariffDTO);
    SessionDTO toDTO(SessionModel tariff);
    List<SessionDTO> toListDTO(List<SessionModel> tariffs);
    List<SessionModel> toListModel(List<SessionDTO> tariffs);
}
