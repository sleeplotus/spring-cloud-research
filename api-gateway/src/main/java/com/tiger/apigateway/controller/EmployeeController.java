package com.tiger.apigateway.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 王澎
 * @date 1/4/2019
 * @company Tiger
 */
@RestController
@Slf4j
public class EmployeeController {

    private final RestTemplate restTemplate;

    @Autowired
    public EmployeeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/employeeDetails/{employeeid}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String getStudents(@PathVariable int employeeid) {
        log.debug("Getting Employee details for " + employeeid);

        String response = restTemplate.exchange("http://employee-service/findEmployeeDetails/{employeeid}",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
                }, employeeid).getBody();

        log.debug("Response Body " + response);

        return "Employee Id -  " + employeeid + " [ Employee Details " + response + " ]";
    }

    public String fallbackMethod(int employeeId) {
        return "Fallback response:: No employee details available temporarily";
    }


}
