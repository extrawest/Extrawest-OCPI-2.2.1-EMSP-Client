package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.TariffDTO;
import com.extrawest.ocpi221emsp_client.model.TariffModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = TariffElementMapper.class)
public interface TariffDocumentMapper {
    TariffModel toTariffDocument(TariffDTO tariffDTO);

    TariffDTO toTariffDTO(TariffModel tariff);

    List<TariffDTO> toListTariffDTO(List<TariffModel> tariffs);

    List<TariffModel> toListTariff(List<TariffDTO> tariffs);
}
