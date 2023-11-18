package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.domain.TariffElement;
import com.extrawest.ocpi221emsp_client.model.TariffElementModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = PriceComponentMapper.class)
public interface TariffElementMapper {
    TariffElementModel toTariffDocument(TariffElement tariffDTO);

    TariffElement toTariffDTO(TariffElementModel tariff);

    List<TariffElement> toListTariffDTO(List<TariffElementModel> tariffs);

    List<TariffElementModel> toListTariff(List<TariffElement> tariffs);
}
