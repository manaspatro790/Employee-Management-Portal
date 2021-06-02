package com.oggy.potal.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.oggy.potal.model.Employee;
import com.oggy.potal.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeRepository employeerepository;
	@Override
	public List<Employee> getAllEmployees(){
		return employeerepository.findAll(); 
	}
	@Override
	public void saveEmployee(Employee employee) {
		this.employeerepository.save(employee);
	}
	@Override
	public Employee getEmployeeById(Long id)  {
		Optional<Employee> optional = employeerepository.findById(id);
		Employee employee=null;
		if(optional.isPresent())
			employee=optional.get();
		else
			throw new RuntimeException("Employee not found for id :"+id);
		return employee;
		
	}
	@Override
	public void deleteEmployeeById(Long id) {
this.employeerepository.deleteById(id);
	}
	
	
	
	
	
}
