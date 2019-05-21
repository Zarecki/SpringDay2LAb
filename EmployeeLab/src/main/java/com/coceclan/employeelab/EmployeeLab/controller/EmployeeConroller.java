package com.coceclan.employeelab.EmployeeLab.controller;

import com.coceclan.employeelab.EmployeeLab.models.Employee;
import com.coceclan.employeelab.EmployeeLab.models.Project;
import com.coceclan.employeelab.EmployeeLab.repository.EmployeeRepo;
import com.coceclan.employeelab.EmployeeLab.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeConroller {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    ProjectRepo projectRepo;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping
    public List<Project> getAllProjects(){
        return projectRepo.findAll();
    }


}
