package com.oggy.potal.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.oggy.potal.model.Employee;

public interface EmployeeService {
 List<Employee> getAllEmployees();
 void saveEmployee(Employee employee);
 Employee getEmployeeById(Long id);
 void deleteEmployeeById(Long id);

}
