package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi.model.domain.AdditionalGeoLocation;
import com.extrawest.ocpi.model.domain.DisplayText;
import com.extrawest.ocpi.model.domain.Image;
import com.extrawest.ocpi.model.domain.PublishTokenType;
import com.extrawest.ocpi.model.dto.EVSEDto;
import com.extrawest.ocpi.model.dto.LocationDto;
import com.extrawest.ocpi.model.enums.Facility;
import com.extrawest.ocpi221emsp_client.model.LocationModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = {AdditionalGeoLocation.class, PublishTokenType.class, EVSEDto.class,
        DisplayText.class, Facility.class, Image.class})
public interface LocationMapper {
    LocationModel toModel(LocationDto dto);

    LocationDto toDto(LocationModel model);

    List<LocationDto> toListDto(List<LocationModel> models);

    List<LocationModel> toListModel(List<LocationDto> models);
}