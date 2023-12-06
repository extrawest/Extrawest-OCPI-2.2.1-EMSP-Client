package com.extrawest.ocpi221emsp_client;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ExceptionMessage {
    public static final String PARTY_NOT_FOUND = "Party was not found";
    public static final String NOT_IMPLEMENTED_ENDPOINT= "Version 2.2.1 has no implemented %s module, check version details";
}
