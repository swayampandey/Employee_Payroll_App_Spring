package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {
    @GetMapping("/employee/{employeeId}")
    public EmployeePayrollData getEmployeePayrollDataById(@PathVariable int employeeId) {
        EmployeePayrollData empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Swayam", 30000));
        return empData;
        
    }
}
