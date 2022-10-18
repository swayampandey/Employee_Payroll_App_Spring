package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j

public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        System.out.println("Employee Payroll Application Connected");
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }

}
