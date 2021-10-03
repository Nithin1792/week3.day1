package week3.day1;

public class InterfaceExecutionClass {

	public static void main(String[] args) {
	
CalIndividualTax obj = new CalIndividualTax();
double incomeAdd = obj.incomeAdd("School", 200, 2000);
//obj.incomeReduce("School", 0, 0);
//obj.publishValue();
System.out.println("Total Income: "+incomeAdd);


CalBusinessTax obj1 = new CalBusinessTax();
double incomeAdd2 = obj1.incomeAdd("Amount", 1234, 4321);
System.out.println("Amount-- "+ incomeAdd2);

obj1.incomeReduce("reduction", incomeAdd, incomeAdd);

	}

}
