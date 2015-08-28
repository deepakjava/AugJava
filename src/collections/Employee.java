package collections;


/**
 * 
 * This class is a Simple class which is capable of storing Employee Details
 * This class has setter and getter methods which sets the values to Instance variables
 * And the Getter methods returns the value to the caller.
 * This class should not (Best Practice) have any other Business Logic or any other Code.
 * 
 * Any such class which is Designed to Store values and to Retrieve Values are called
 * ***JAVA BEAN CLASS **** OR ***POJO (Plain Old Java Object) ***
 *
 */
public class Employee {
	
	private int empId;
	private String empName;
	private int empSal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
}
