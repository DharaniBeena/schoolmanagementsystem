package SchoolManagementSystem.SchoolManagementWithSB.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SchoolManagementSystem.SchoolManagementWithSB.model.Employee;
import SchoolManagementSystem.SchoolManagementWithSB.model.EmployeeAttendance;
import SchoolManagementSystem.SchoolManagementWithSB.service.AdminService;

@RestController
@RequestMapping("school/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	//JPA
	@PostMapping(path = "empAttendance", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeAttendance> getEmployeeAttendance()   
	{  
		return adminService.getEmployeeAttendance();
	}
	
	//jdbc Template
	@PostMapping(path = "studentDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String, Object>> getStudents()
	{
		return adminService.viewStudents();
	}
	@PostMapping(path = "teacherDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String, Object>> getTeachers()
	{
		return adminService.viewTeachers();
	}
	}