package week3.day1;

public class CalculatorOverLoading {
	
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Addition with two arguments: "+sum);
	}

	public void add(int a , int b, int c) {
		int sum=a+b+c;
		System.out.println("Addition with three Arguments: "+sum);
	}
	
	public void subtract(int o, int p) {
		int sub = o-p;
		System.out.println("Subtraction with two arguments of int: " + sub);

	}
	
	public void subtract(double q, double r) {
		double sub1 = q-r;
		System.out.println("Subtraction with two arguments of double: " + sub1);
	}
	
	public void multiply(int w, int t) {
		int mul = w*t;
		System.out.println("Multiplication with two arguments of int: " + mul);

	}
	
	public void multiply(int s, double h) {
		double mul1 = s*h;
		System.out.println("Multiplication with two arguments of one int and one double: " + mul1);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorOverLoading common = new CalculatorOverLoading();
		common.add(18, 20);
		common.add(10, 10, 10);
		common.multiply(10,100);
		common.multiply(17, 34.5);
		common.subtract(2.09, 2.09);
		common.subtract(20, 10);
	}
	}


