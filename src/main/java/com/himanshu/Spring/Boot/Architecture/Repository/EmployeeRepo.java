package com.himanshu.Spring.Boot.Architecture.Repository;

import com.himanshu.Spring.Boot.Architecture.entity.Employee;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRepo {

    public Employee getEmployee(Integer id){
    return new Employee("it",19,"Himanshu",1);
        // Data Base operation
    }

}
