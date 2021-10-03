package week3.day1;

public class LearnOverloading {

	public void getEmployeeDetails() {
		int empId = 101;
		String empName = "Hari";
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee ID: " + empId);
	}
	// Overloading

	public void getEmployeeDetails(int empId) {
		System.out.println("overload method1");

	}

	public void getEmployeeDetails(int empId, String empName) {
		System.out.println("overload method2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnOverloading emp = new LearnOverloading();
		emp.getEmployeeDetails();
		emp.getEmployeeDetails(202);
		emp.getEmployeeDetails(202,"Nithin");

	}

}
