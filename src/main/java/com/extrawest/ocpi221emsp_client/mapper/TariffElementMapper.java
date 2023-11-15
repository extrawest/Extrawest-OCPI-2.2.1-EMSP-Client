package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.TariffElementDTO;
import com.extrawest.ocpi221emsp_client.model.TariffElement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = PriceComponentMapper.class)
public interface TariffElementMapper {
    TariffElement toTariffDocument(TariffElementDTO tariffDTO);

    TariffElementDTO toTariffDTO(TariffElement tariff);

    List<TariffElementDTO> toListTariffDTO(List<TariffElement> tariffs);

    List<TariffElement> toListTariff(List<TariffElementDTO> tariffs);
}
