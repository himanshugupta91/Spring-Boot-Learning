package com.himanshu.Spring.Boot.Architecture.entity;


import com.himanshu.Spring.Boot.Architecture.dto.EmployeeDTo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {
@Id
    String dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    Integer age;
    String name;
    Integer id;

    public Employee(String dept, Integer age, String name, Integer id) {
        this.dept = dept;
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public Employee() {

    }



}
