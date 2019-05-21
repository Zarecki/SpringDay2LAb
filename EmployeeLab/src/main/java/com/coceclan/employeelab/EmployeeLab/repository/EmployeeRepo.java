package com.coceclan.employeelab.EmployeeLab.repository;

import com.coceclan.employeelab.EmployeeLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
