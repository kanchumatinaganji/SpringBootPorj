package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>{
	

}
