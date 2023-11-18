package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.domain.commands.CommandResult;
import com.extrawest.ocpi.model.enums.CommandType;
import com.extrawest.ocpi.service.EMSPCommandsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EMSPCommandsServiceImpl implements EMSPCommandsService {
    @Override
    public void postCommand(CommandResult commandResult, CommandType commandType, String uniqueId) {
        log.info("Result for command {} was received", commandType);
    }
}
