package com.himanshu.Spring.Boot.Architecture.controller;

import com.himanshu.Spring.Boot.Architecture.Service.EmployeeService;
import com.himanshu.Spring.Boot.Architecture.dto.EmployeeDTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeDTo> getEmployee(@PathVariable Integer id) {

        EmployeeDTo employee = employeeService.getEmployee(id);
       return ResponseEntity.ok(employee);

    }
}
