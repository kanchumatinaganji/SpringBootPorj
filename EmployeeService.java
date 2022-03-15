package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Employee;
import com.example.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired(required = false)
     private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployee(){
		List<Employee> employeelist=new ArrayList<>();
		
		employeeRepository.findAll().forEach(employeelist::add);
		
		
		return employeelist;
	}
	
	public Employee getEmployee(String id) {
		return employeeRepository.findById(id).get();
		
	}
	
	public void addEmployee(Employee employee) {
	employeeRepository.save(employee);
	System.out.println("successfully added employee");
	}
	
	public void updateEmployee(String id,Employee employee) {
		employeeRepository.save(employee);
		
	}
	public void deleteEmployee(String id) {
		
	employeeRepository.deleteById(id);
	}
	
}
