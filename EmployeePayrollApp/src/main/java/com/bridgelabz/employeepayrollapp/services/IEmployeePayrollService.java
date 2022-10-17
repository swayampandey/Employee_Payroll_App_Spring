package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int employeeId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int employeeId,EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeeData(int employeeId);
}
