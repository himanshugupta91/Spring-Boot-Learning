package com.himanshu.Spring.Boot.Architecture.dto;

import com.himanshu.Spring.Boot.Architecture.entity.Employee;

public class EmployeeDTo {

    String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer age;
    String name;

    public EmployeeDTo EmployeeMapper(Employee employee){
        this.setName(employee.getName());
        this.setDept(employee.getDept());
        this.setAge(employee.getAge());
        return this;
    }

}
