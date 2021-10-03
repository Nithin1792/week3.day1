package week3.day1;

public interface TaxCalculationInterface {
	// all the three below methods are unimplemented methods , there is no body for implementation - more like a template 
	//documentation:/** and enter - before the method u shld do
	/**
	 * 
	 * @param Business Name
	 * @author Nithin
	 * @param sal1
	 * @param sal2
	 * @return
	 * @exception : exceptions expected
	 */
	
	public double incomeAdd(String name, double sal1, double sal2 );
	/**
	 * 
	 * @param sal
	 * @param amount1
	 * @param amount2
	 * @return
	 */
	//public is default here no need to mention in it explicitly
	double incomeReduce(String sal, double amount1, double amount2);
	/**
	 * 
	 */
	
	
	void publishValue();

	
	
}
