package collections;

import java.util.ArrayList;

/*
 * ArrayList
 * - Can GROW or SHRINK Dynamically
 * 
 */
public class ArrayListUserDefinedObjects {

	public static void main(String[] args) {
		
		/************** Arrays ******************/
		int a[] = new int[5]; //In Arrays we Define the SIZE
		a[0] = 1;
		a[1] = 2;
		a[2] = 10;
		a[3] = 40;
		a[4] = 80;
		//a[5] = 100; //This is NOT POSSIBLE as the Size of Array is fixed to 5 and we cannot INSERT 6th Value
		System.out.println("*******Values Printed from an Array***********");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("***********Employee Details*************");
		/***************** Array List *************/
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Bhushan");
		e1.setEmpSal(5000);

		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpName("Avinash");
		e2.setEmpSal(6000);
		
		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setEmpName("Ganguly");
		e3.setEmpSal(7000);
		
		//System.out.println(e3.getEmpName());

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);//This will be stored index=0
		empList.add(e2);//index=1
		empList.add(e3);//index=2
		
		for(int i=0; i<empList.size(); i++) {
			System.out.println(("========================================================"));
			Employee e =(Employee) empList.get(i); //This will return the Object in 2nd Index
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpSal());
		}
		
	/*		
		ArrayList al = new ArrayList(); //In ArrayList we do not define the SIZE
		//I have not defined any Datatype for this ArrayList and hence it can STORE ANY TYPE
		al.add(1); //index=0
		al.add(2); //index=1
		al.add(10); //index=2
		al.add(40); //index=3
		al.add(80); //index=4
		System.out.println("*******Values Printed from an ArrayList: Size = " + al.size()+ "***********");
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		//Grow - Add new value Or Insert New value In between
		al.add(100); //This will add the value at the end of ArrayList. index=5
		al.add(3, 30); //Insert a value '30' in index=3
		al.add("Java"); //Adding a String  to ArrayList, which is Possible
		al.add(e1); //Adding Employee Object to ArrayList (AL is accepting any User Defined Objects)
		
		
		System.out.println("*******Values Printed from an ArrayList After it Grew Dynamically: Size = " + al.size()+ "***********");
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Shrink - Can Delete a value
		al.remove(3); //This will REMOVE the value present in Index=3
		System.out.println("*******Values Printed from an ArrayList After it SHRINK Dynamically: Size = " + al.size()+ "***********");
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}

*/		
	}
}
