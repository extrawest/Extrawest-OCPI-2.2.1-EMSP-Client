package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.dto.tariff.TariffRestrictions;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class TariffElementModel {
    private List<PriceComponentModel> priceComponents;
    private TariffRestrictions restrictions;
}