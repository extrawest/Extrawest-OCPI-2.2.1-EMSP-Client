package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.enums.TariffDimensionType;
import jakarta.validation.constraints.Digits;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PriceComponent {
    private TariffDimensionType type;

    @Digits(integer = Integer.MAX_VALUE, fraction = 4)
    private Float price;

    @Digits(integer = Integer.MAX_VALUE, fraction = 4)
    private Float vat;

    private int step_size;
}
