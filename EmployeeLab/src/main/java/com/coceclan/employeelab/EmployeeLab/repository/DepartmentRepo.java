package com.coceclan.employeelab.EmployeeLab.repository;

import com.coceclan.employeelab.EmployeeLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
