package filieio;

import java.io.Serializable;

//This class is just used to store EMployee Details
//For each employee we need to create differemt object - ie, One Object created or this Employee class represents details of One Employee

//Note: Serializable is a Marker Interface. This do not have any Methods. This needs to be implemented by any Java class to tell Java that this class needs to be sent
//outside my Java or needs to be persisted or needs to be sent over the network
public class Employee implements Serializable {

	private String empName;//String is also a class and i am creating an Object of String class, why Java is not throwing NotSerializableException for String class??
	//Ans: String class is Sierialized by default
	private int empId;
	private String empDept;
	
	private Department dept; //Any class refered by this class SHOULD ALSO be Serialized
	
	public Employee(int empId, String empName, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		dept = new Department();
	}
	
	public void printEmployee() {
		System.out.println("EmpId=" + empId + " Emp Name = " + empName + " Emp Dept = " + empDept);
	}
}
