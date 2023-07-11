package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.request.CommandResultRequestDTO;
import com.extrawest.ocpi.model.enums.CommandType;
import com.extrawest.ocpi.service.EMSPCommandsService;
import org.springframework.stereotype.Service;

@Service
public class EMSPCommandsServiceImpl implements EMSPCommandsService {
    @Override
    public void postCommand(CommandResultRequestDTO commandResult, CommandType commandType, String uniqueId) {

    }
}
