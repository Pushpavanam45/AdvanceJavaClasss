package Students;


import jakarta.persistence.*;

@Entity
public class Student {
	
@Id
private String sno;
private String sname;
private String Department;
private String address;
private int rollno;
public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", Department=" + Department + ", address=" + address
			+ ", rollno=" + rollno + "]";
}


}
