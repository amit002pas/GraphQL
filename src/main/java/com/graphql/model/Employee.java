package com.graphql.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table
@Entity
public class Employee {

    @Id
    private Integer empId;
    private String name;
    private Integer salary;

    public Employee(Integer empId, String name, Integer salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
