package com.selfcode.spring.springboot.springdatajpa.controller;

import com.selfcode.spring.springboot.springdatajpa.entity.Employee;
import com.selfcode.spring.springboot.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showEmps() {
        List<Employee> allEmps = employeeService.getAllEmps();
        return allEmps;
    }

    @GetMapping("/employees/{id}")
    public Employee showEpmById(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee newEmp(@RequestBody Employee employee){
        employeeService.saveEmps(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee upEmp(@RequestBody Employee employee){
        employeeService.saveEmps(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmp(@PathVariable int id){
            employeeService.deleteEmp(id);
            return "Employee with ID " + id + " was deleted.";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> showEmpsByName(@PathVariable String name){
        List<Employee> employees = employeeService.getEmpsByName(name);
        return employees;
    }
}