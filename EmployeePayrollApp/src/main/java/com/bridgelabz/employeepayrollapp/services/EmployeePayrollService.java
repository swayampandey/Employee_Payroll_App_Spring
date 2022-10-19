package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollExceptionHandler;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {

        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
        return employeePayrollList.stream()
                .filter(employeePayrollData -> employeePayrollData.getEmployeeId() == employeeId)
                .findFirst()
                .orElseThrow(() -> new EmployeePayrollException("Employee not found"));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(employeePayrollList.size()+1,employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int employeeId,EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
        empData.setName(employeePayrollDTO.name);
        empData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(employeeId-1,empData);
        return empData;
    }



    @Override
    public void deleteEmployeeData(int employeeId) {
        employeePayrollList.remove(employeeId-1);
    }
}
