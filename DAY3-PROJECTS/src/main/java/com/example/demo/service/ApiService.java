package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

import com.example.demo.repository.EmployeeRepo;

@Service
public class ApiService {
@Autowired
EmployeeRepo er;
public Employee saveInfo(Employee ss) {
	return er.save(ss);
}
public List<Employee> showInfo(){
	return er.findAll();
	
}
}
