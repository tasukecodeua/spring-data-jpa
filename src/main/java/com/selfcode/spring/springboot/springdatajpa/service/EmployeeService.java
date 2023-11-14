package com.selfcode.spring.springboot.springdatajpa.service;

import com.selfcode.spring.springboot.springdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmpsByName(String name);
    public List<Employee> getAllEmps();
    public void saveEmps(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmp(int id);
}
