package com.himanshu.Spring.Boot.Architecture.Service;

import com.himanshu.Spring.Boot.Architecture.Repository.EmployeeRepo;
import com.himanshu.Spring.Boot.Architecture.dto.EmployeeDTo;
import com.himanshu.Spring.Boot.Architecture.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeDTo getEmployee(Integer id) {

        // business operation
       Employee employee = employeeRepo.getEmployee(id);

       EmployeeDTo employeeDTo = new EmployeeDTo();
      return employeeDTo.EmployeeMapper(employee);

    }
}
