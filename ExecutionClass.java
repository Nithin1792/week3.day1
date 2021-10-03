package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.enableAirbag();
		b.applyBrake();
		b.driveVehicle();
		b.shiftGear();
		b.startEngine();
		int bmwWheels = b.wheels;
System.out.println("BMW wheel count: "+ bmwWheels );


AUDI a = new AUDI();
int audiWheels = a.wheels;
	
	a.enableAirbag();
	a.applyBrake();
	a.driveVehicle();
	a.shiftGear();
	a.startEngine();
	System.out.println("AUDI wheel count: "+ audiWheels);
	
	}

}
