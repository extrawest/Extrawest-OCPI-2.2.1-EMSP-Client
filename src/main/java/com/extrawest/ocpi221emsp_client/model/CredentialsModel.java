package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.domain.CredentialsRole;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "credentials")
@Data
@NoArgsConstructor
public class CredentialsModel {
    @Id
    private String id;

    private String token;
    private String url;
    private List<CredentialsRole> roles;
}
