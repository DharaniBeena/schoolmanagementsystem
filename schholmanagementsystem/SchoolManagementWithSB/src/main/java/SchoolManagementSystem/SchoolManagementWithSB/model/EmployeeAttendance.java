package SchoolManagementSystem.SchoolManagementWithSB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeAttendance")
public class EmployeeAttendance {
@Column
@Id
private String empId;
@Column
private String EntryDate;
@Column
private String LoginTime;
public EmployeeAttendance()
{
	this.empId=null;
	this.EntryDate=null;
	this.LoginTime=null;
}
public EmployeeAttendance(String empId, String entryDate, String loginTime) {
	super();
	this.empId = empId;
	EntryDate = entryDate;
	LoginTime = loginTime;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEntryDate() {
	return EntryDate;
}
public void setEntryDate(String entryDate) {
	EntryDate = entryDate;
}
public String getLoginTime() {
	return LoginTime;
}
public void setLoginTime(String loginTime) {
	LoginTime = loginTime;
}
}