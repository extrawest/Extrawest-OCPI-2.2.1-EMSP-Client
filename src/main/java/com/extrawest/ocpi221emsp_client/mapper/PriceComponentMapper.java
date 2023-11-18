package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.tariff.PriceComponent;
import com.extrawest.ocpi221emsp_client.model.PriceComponentModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceComponentMapper {
    PriceComponentModel toModel(PriceComponent dto);

    PriceComponent toDto(PriceComponentModel model);

    List<PriceComponentModel> toModels(List<PriceComponent> dtos);

    List<PriceComponent> toDtos(List<PriceComponentModel> models);
}
