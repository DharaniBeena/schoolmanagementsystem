package SchoolManagementSystem.SchoolManagementWithSB.service;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import SchoolManagementSystem.SchoolManagementWithSB.model.EmployeeAttendance;
import SchoolManagementSystem.SchoolManagementWithSB.model.Student;
import SchoolManagementSystem.SchoolManagementWithSB.model.Teacher;
import SchoolManagementSystem.SchoolManagementWithSB.repository.EmployeeAttendanceRepository;
import SchoolManagementSystem.SchoolManagementWithSB.repository.StudentRepository;
import SchoolManagementSystem.SchoolManagementWithSB.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	public TeacherRepository teacherRepository;
	@Autowired
	public EmployeeAttendanceRepository employeeAttendanceRepository;

	//JPA 
	public void login(EmployeeAttendance employeeAttendance) {
		System.out.println(
				"EmployeeID: " + employeeAttendance.getEmpId() + "\nLogin Time: " + employeeAttendance.getLoginTime());
		employeeAttendanceRepository.save(employeeAttendance);
	}
	//Registering teacher records
	public int registerTeacher(Teacher teacher) {
		return teacherRepository.addTeacher(teacher);
	}
	
	//Deleting teacher records
	public int deleteTeacher(Teacher teacher) {
		return teacherRepository.deleteTeacher(teacher);
	}

	public int updateSalary(long empId, long salary) {
		Teacher teacher = new Teacher();
		teacher.setSalary(salary);
		System.out.println("Emp id : " + empId + "Updated Salary: " + teacher.getSalary());
		return teacherRepository.updateSalary(empId, salary);
	}

	public int updateSpecialization(long empId, String Specialization) {
		Teacher teacher = new Teacher();
		teacher.setSpecialization(Specialization);
		System.out.println("Emp id : " + empId + " Updated Specialization: " + teacher.getSpecialization());
		return teacherRepository.updateSpecialization(empId, Specialization);
	}
}