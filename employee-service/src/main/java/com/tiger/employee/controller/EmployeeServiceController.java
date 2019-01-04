package com.tiger.employee.controller;

import com.tiger.employee.beans.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王澎
 * @date 1/4/2019
 * @company Tiger
 */
@RestController
@Slf4j
public class EmployeeServiceController {

    private static final Map<Integer, Employee> employeeData = new HashMap<Integer, Employee>() {
        private static final long serialVersionUID = -3970206781360313502L;

        {
            put(111, new Employee(111, "Employee1"));
            put(222, new Employee(222, "Employee2"));
        }
    };

    @RequestMapping(value = "/findEmployeeDetails/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable int employeeId) {
        log.debug("Getting Employee details for " + employeeId);

        Employee employee = employeeData.get(employeeId);
        if (employee == null) {

            employee = new Employee(0, "N/A");
        }
        return employee;
    }
}
