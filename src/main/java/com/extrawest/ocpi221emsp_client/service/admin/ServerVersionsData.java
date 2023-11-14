package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi.model.enums.VersionNumber;
import com.extrawest.ocpi.model.vo.CredentialsRole;

import java.util.List;

public interface ServerVersionsData {
    String getVersionsUrl();
    List<CredentialsRole> getVersionsRole();
}
