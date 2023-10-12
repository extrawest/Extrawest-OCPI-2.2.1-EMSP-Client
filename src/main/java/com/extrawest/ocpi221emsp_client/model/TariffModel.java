package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.enums.TariffType;
import com.extrawest.ocpi.model.vo.DisplayText;
import com.extrawest.ocpi.model.vo.EnergyMix;
import com.extrawest.ocpi.model.vo.Price;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "tariffs")
@Data
@NoArgsConstructor
public class TariffModel {

    private String countryCode;

    private String partyId;

    @Id
    private String id;

    private String currency;

    private TariffType type;

    private List<DisplayText> tariffAltText;

    private String tariffAltUrl;

    private Price minPrice;

    private Price maxPrice;

    private List<TariffElement> elements;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private EnergyMix energyMix;

    private LocalDateTime lastUpdated;
}