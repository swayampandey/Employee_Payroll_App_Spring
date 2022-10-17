package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Swayam",40000)));
        return empDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,new EmployeePayrollDTO("Swayam", 40000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO);
        return empData;
    }

//    @Override
//    public EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
//        EmployeePayrollData empData = null;
//        empData = new EmployeePayrollData(1,employeePayrollDTO);
//        return empData;
//    }

    @Override
    public void deleteEmployeeData(int employeeId) {

    }
}
