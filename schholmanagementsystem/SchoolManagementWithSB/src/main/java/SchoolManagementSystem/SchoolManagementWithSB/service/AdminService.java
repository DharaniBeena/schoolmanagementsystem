package SchoolManagementSystem.SchoolManagementWithSB.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SchoolManagementSystem.SchoolManagementWithSB.model.Employee;
import SchoolManagementSystem.SchoolManagementWithSB.model.EmployeeAttendance;
import SchoolManagementSystem.SchoolManagementWithSB.repository.AdminRepository;
import SchoolManagementSystem.SchoolManagementWithSB.repository.EmployeeAttendanceRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private EmployeeAttendanceRepository employeeAttendanceRepository;
	//JPA
	public List<EmployeeAttendance> getEmployeeAttendance()   
	{  
		List<EmployeeAttendance> list=new ArrayList<EmployeeAttendance>();
		employeeAttendanceRepository.findAll().forEach(list::add);
		return list;
	}
	
	//jdbcTemplate
	public List<Map<String, Object>> viewStudents()
	{
		return adminRepository.getStudentRecords();
	}
	
	public List<Map<String, Object>> viewTeachers()
	{
		return adminRepository.getTeacherRecords();
	}
		
}