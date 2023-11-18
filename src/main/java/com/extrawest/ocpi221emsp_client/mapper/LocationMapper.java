package com.extrawest.ocpi221emsp_client.mapper;


import com.extrawest.ocpi.model.dto.DisplayText;
import com.extrawest.ocpi.model.dto.location.*;
import com.extrawest.ocpi.model.enums.Facility;
import com.extrawest.ocpi221emsp_client.model.LocationModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = {AdditionalGeoLocation.class, PublishTokenType.class, EVSE.class,
        DisplayText.class, Facility.class, Image.class})
public interface LocationMapper {
    LocationModel toModel(Location dto);

    Location toDto(LocationModel model);

    List<Location> toListDto(List<LocationModel> models);

    List<LocationModel> toListModel(List<Location> models);
}