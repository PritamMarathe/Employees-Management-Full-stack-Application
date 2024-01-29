package com.EmployeeManagmentSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagmentSystem.Repository.EmployeeRepo;
import com.EmployeeManagmentSystem.exception.UserNotFoundException;
import com.EmployeeManagmentSystem.model.Employee;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService (EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

  //UUID:A class that represents an immutable universally 
  //unique identifier (UUID).A UUID represents a 128-bit value. 
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

//    If we are not found Employee by Id then throw the exception and print this massage
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}