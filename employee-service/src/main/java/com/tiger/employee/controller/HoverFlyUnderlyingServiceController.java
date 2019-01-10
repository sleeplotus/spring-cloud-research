package com.tiger.employee.controller;

import com.tiger.employee.beans.HoverflyServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * @author 王澎
 * @date 1/7/2019
 * @company Tiger
 */
@RestController
@Slf4j
public class HoverFlyUnderlyingServiceController {
    @RequestMapping(value = "/service/hoverfly")
    public HoverflyServiceResponse getSampleResponse() {
        log.debug("Inside HoverflyActualServiceApplication::getSampleResponse()");
        return new HoverflyServiceResponse("returned value from HoverflyActualServiceApplication", new Date().toString(), UUID.randomUUID().toString());
    }
}
