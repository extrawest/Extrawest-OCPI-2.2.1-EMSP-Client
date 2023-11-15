package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.dto.LocationDTO;
import com.extrawest.ocpi.model.enums.Facility;
import com.extrawest.ocpi.model.vo.*;
import com.extrawest.ocpi221emsp_client.model.LocationModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = {AdditionalGeoLocation.class, PublishTokenType.class, Evse.class,
        DisplayText.class, Facility.class, Image.class})
public interface LocationMapper {
    LocationModel toModel(LocationDTO dto);

    LocationDTO toDto(LocationModel model);

    List<LocationDTO> toListDto(List<LocationModel> models);

    List<LocationModel> toListModel(List<LocationDTO> models);
}