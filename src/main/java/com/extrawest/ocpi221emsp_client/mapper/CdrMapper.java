package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.ChargingPeriod;
import com.extrawest.ocpi.model.dto.cdr.CDRDto;
import com.extrawest.ocpi.model.dto.tariff.TariffDto;
import com.extrawest.ocpi221emsp_client.model.CdrModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TariffDto.class, ChargingPeriod.class})
public interface CdrMapper {
    CdrModel toModel(CDRDto dto);

    CDRDto toDto(CdrModel model);

    List<CDRDto> toListDto(List<CdrModel> models);

    List<CdrModel> toListModel(List<CDRDto> models);
}
