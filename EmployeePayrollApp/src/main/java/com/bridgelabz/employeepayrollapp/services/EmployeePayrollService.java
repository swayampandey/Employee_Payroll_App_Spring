package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    @Autowired
    EmployeePayrollRepository employeePayrollRepository;

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
        return employeePayrollRepository.save(employeePayrollData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int employeeId,EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
        empData.setName(employeePayrollDTO.getName());
        empData.setSalary(employeePayrollDTO.getSalary());
        empData.setStartDate(employeePayrollDTO.getStartDate());
        empData.setGender(employeePayrollDTO.getGender());
        empData.setNote(employeePayrollDTO.getNote());
        empData.setProfilePic(employeePayrollDTO.getName());
        empData.setDepartment(employeePayrollDTO.getDepartment());
        employeePayrollList.set(employeeId-1,empData);
        return employeePayrollRepository.save(empData);
    }



    @Override
    public void deleteEmployeeData(int employeeId) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
        employeePayrollRepository.delete(empData);
    }
}
