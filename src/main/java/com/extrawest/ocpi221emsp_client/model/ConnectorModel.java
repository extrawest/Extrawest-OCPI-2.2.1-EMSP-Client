package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.enums.ConnectorFormat;
import com.extrawest.ocpi.model.enums.ConnectorType;
import com.extrawest.ocpi.model.enums.PowerType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "connectors")
@Data
@NoArgsConstructor
public class ConnectorModel {
    private String evseId;
    private String locationId;
    private String id;
    private ConnectorType standard;
    private ConnectorFormat format;
    private PowerType powerType;
    private Integer maxVoltage;
    private Integer max_amperage;
    private Integer max_electric_power;
    private List<String> tariffIds;
    private String termsAndConditions;
    private LocalDateTime lastUpdated;
}
