package com.selfcode.spring.springboot.springdatajpa.service;

import com.selfcode.spring.springboot.springdatajpa.dao.EmployeeRepository;
import com.selfcode.spring.springboot.springdatajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceEmpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmpsByName(String name) {
        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }

    @Override
    public List<Employee> getAllEmps() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmps(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmp(int id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employee = optional.get();
        }
        return employee;
    }

    @Override
    public void deleteEmp(int id) {
        employeeRepository.deleteById(id);
    }
}
