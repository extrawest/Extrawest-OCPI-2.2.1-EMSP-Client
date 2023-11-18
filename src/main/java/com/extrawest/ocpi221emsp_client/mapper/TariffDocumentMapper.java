package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.tariff.Tariff;
import com.extrawest.ocpi221emsp_client.model.TariffModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = TariffElementMapper.class)
public interface TariffDocumentMapper {
    TariffModel toTariffDocument(Tariff tariffDTO);

    Tariff toTariffDTO(TariffModel tariff);

    List<Tariff> toListTariffDTO(List<TariffModel> tariffs);

    List<TariffModel> toListTariff(List<Tariff> tariffs);
}
