package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.enums.Capability;
import com.extrawest.ocpi.model.enums.ParkingRestriction;
import com.extrawest.ocpi.model.enums.Status;
import com.extrawest.ocpi.model.vo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "locations")
@Data
@NoArgsConstructor
public class EvseModel {
    @Id
    private String uid;
    private String locationId;
    private String evseId;
    private Status status;
    private List<StatusSchedule> status_schedule;
    private List<Capability> capabilities;
    private List<Connector> connectors;
    private String floorLevel;
    private GeoLocation coordinates;
    private String physicalReference;
    private List<DisplayText> directions;
    private List<ParkingRestriction> parkingRestrictions;
    private List<Image> images;
    private LocalDateTime lastUpdated;
}
