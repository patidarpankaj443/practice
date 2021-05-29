package com.empManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empManager.model.Employee;
import com.empManager.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class EmployeeManagerController {
    @Autowired
	EmployeeService empService;
    @GetMapping("/employee/all")
    public List<Employee>getEmployee(){
    	
		return empService.getEmployees();
    	
    }
    @PostMapping("/employee/add")
    public void saveEmployee(@RequestBody Employee emp) {
    	empService.saveEmployee(emp);
    }
    @PutMapping("/employee/update")
    public void updateEmployee(@RequestBody Employee emp) {
    	empService.updateEmployee(emp);
    }
    @DeleteMapping("/employee/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
    	empService.deleteEmployee(id);
    }
}
