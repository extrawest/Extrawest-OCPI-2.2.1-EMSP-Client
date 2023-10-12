package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.CdrDTO;
import com.extrawest.ocpi.model.dto.TariffDTO;
import com.extrawest.ocpi.model.vo.ChargingPeriod;
import com.extrawest.ocpi221emsp_client.model.CdrModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TariffDTO.class, ChargingPeriod.class})
public interface CdrMapper {
    CdrModel toModel(CdrDTO dto);
    CdrDTO toDto(CdrModel model);
    List<CdrDTO> toListDto(List<CdrModel> models);
    List<CdrModel> toListModel(List<CdrDTO> models);
}
