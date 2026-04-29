package inheritance;

public class ElectricCar extends Car {

	public void autopilot()
	{
		System.out.println("No human needed");
     }
	
	public static void main(String[] args) {
		
		ElectricCar obj = new ElectricCar();
		
		obj.drive();
		obj.tesla();
		obj.autopilot();
	}

}
