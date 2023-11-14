package com.extrawest.ocpi221emsp_client;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.service.admin.RegisteredPartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-panel")
@RequiredArgsConstructor
public class AdminController {
    private final RegisteredPartyService basicCredentialsService;

    @GetMapping
    public ResponseEntity<RegisteredParty> getCredentialsA() {
        RegisteredParty credentialsA = basicCredentialsService.generateCredentialsA();
        return ResponseEntity.ok(credentialsA);
    }

}
