package com.empManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empManager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
