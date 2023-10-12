package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.PriceComponentDTO;
import com.extrawest.ocpi221emsp_client.model.PriceComponent;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceComponentMapper {
    PriceComponent toModel(PriceComponentDTO dto);
    PriceComponentDTO toDto(PriceComponent model);

    List<PriceComponent> toModels(List<PriceComponentDTO> dtos);
    List<PriceComponentDTO> toDtos(List<PriceComponent> models);
}
