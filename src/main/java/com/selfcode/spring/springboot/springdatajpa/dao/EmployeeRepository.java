package com.selfcode.spring.springboot.springdatajpa.dao;

import com.selfcode.spring.springboot.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
