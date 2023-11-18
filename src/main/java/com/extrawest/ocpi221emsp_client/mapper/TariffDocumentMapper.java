package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.TariffDto;
import com.extrawest.ocpi221emsp_client.model.TariffModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = TariffElementMapper.class)
public interface TariffDocumentMapper {
    TariffModel toTariffDocument(TariffDto tariffDTO);

    TariffDto toTariffDTO(TariffModel tariff);

    List<TariffDto> toListTariffDTO(List<TariffModel> tariffs);

    List<TariffModel> toListTariff(List<TariffDto> tariffs);
}
