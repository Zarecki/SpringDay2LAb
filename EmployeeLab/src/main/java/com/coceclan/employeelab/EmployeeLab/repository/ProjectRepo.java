package com.coceclan.employeelab.EmployeeLab.repository;

import com.coceclan.employeelab.EmployeeLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
