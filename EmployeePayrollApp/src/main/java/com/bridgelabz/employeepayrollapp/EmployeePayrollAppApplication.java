package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j

public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        System.out.println("Employee Payroll Application Connected");
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee payroll App Started in {} Environment",context.getEnvironment().getProperty("environment"));
    }
}
