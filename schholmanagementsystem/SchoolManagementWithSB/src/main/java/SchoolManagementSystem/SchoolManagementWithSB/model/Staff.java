package SchoolManagementSystem.SchoolManagementWithSB.model;
import javax.persistence.Entity;

@Entity
public class Staff extends Employee
{

private String Worktype;

public String getWorktype() {
	return Worktype;
}

public void setWorktype(String worktype) {
	Worktype = worktype;
}
}