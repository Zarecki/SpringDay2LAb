package com.coceclan.employeelab.EmployeeLab;

import com.coceclan.employeelab.EmployeeLab.models.Department;
import com.coceclan.employeelab.EmployeeLab.models.Employee;
import com.coceclan.employeelab.EmployeeLab.models.Project;
import com.coceclan.employeelab.EmployeeLab.repository.DepartmentRepo;
import com.coceclan.employeelab.EmployeeLab.repository.EmployeeRepo;
import com.coceclan.employeelab.EmployeeLab.repository.ProjectRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	DepartmentRepo departmentRepo;

	@Autowired
	ProjectRepo projectRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Finance");
		departmentRepo.save(department);

		Employee employee = new Employee("Ronald", "MacDonald", 23511, department);
		employeeRepo.save(employee);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("Special Affairs");
		departmentRepo.save(department);

		Employee employee1 = new Employee("Jimmy", "Johnstone", 3562, department);
		employeeRepo.save(employee1);

		Project project = new Project("Project Armageddon", 10);
		projectRepo.save(project);

		project.addEmployee(employee1);
		projectRepo.save(project);
	}
}
