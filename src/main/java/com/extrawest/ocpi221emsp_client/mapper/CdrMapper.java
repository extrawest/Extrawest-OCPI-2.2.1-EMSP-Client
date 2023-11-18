package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.ChargingPeriod;
import com.extrawest.ocpi.model.dto.cdr.CDR;
import com.extrawest.ocpi.model.dto.tariff.Tariff;
import com.extrawest.ocpi221emsp_client.model.CdrModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Tariff.class, ChargingPeriod.class})
public interface CdrMapper {
    CdrModel toModel(CDR dto);

    CDR toDto(CdrModel model);

    List<CDR> toListDto(List<CdrModel> models);

    List<CdrModel> toListModel(List<CDR> models);
}
