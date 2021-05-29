package com.empManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empManager.Exception.EmployeeException;
import com.empManager.model.Employee;
import com.empManager.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
	EmployeeRepo empRepo;
    
    public List<Employee> getEmployees(){
    	
		return empRepo.findAll();
    	
    }
    public void saveEmployee(Employee emp) {
    	System.out.println("/////////////////////");
    	empRepo.save(emp);
    }
    public void updateEmployee(Employee emp) {
    	Employee emp1=empRepo.getOne(emp.getId());
    	if(emp1!=null) {
    		empRepo.save(emp);
    	}
    	else
    		throw new EmployeeException("Employee is not available");
    }
    public void deleteEmployee(Long id) {
    	Employee emp=empRepo.getOne(id);
    	if(emp!=null)
    	empRepo.deleteById(id);
    	else
    		throw new EmployeeException("Employee is not available");
    }
}
