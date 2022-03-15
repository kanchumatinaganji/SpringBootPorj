 package com.example.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Language;


@Repository
public interface LanguageRepository extends CrudRepository<Language, String>{
	public List<Language>  findByEmployeeId(String employeeId);

}
