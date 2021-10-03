package week3.day1;

public class CalIndividualTax implements TaxCalculationInterface {

	public double incomeAdd(String name, double sal1, double sal2) {
		System.out.println("Buisness Name : " + name);
		System.out.println("Income Source 1: " + sal1);
		System.out.println("Income source 2: " + sal2);
		
		double totalIncome=sal1+sal2;
		
		return totalIncome;
	}

	public double incomeReduce(String sal, double amount1, double amount2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void publishValue() {
		// TODO Auto-generated method stub
		
	}

//	public double incomeReduce(String school, double amount1, double amount2) {
//		System.out.println("Salary Unit: " + school);
//		System.out.println("Income deduction 1: " + amount1);
//		System.out.println("Income deduction 2: " + amount2);
//		return 0;
//	}
//
//	public void publishValue() {
//		// TODO Auto-generated method stub
//		System.out.println("Nothin to return");
//		System.out.println();
//	}

}