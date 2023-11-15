package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.vo.TariffRestrictions;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class TariffElement {
    private List<PriceComponent> priceComponents;
    private TariffRestrictions restrictions;
}
