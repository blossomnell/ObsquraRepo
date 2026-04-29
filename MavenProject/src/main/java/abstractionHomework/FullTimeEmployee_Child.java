//multiply by constant 8 hours

package abstractionHomework;

public class FullTimeEmployee_Child extends Employee_Parent{

	public static void main(String[] args) {
		//abstraction with no polymorphism
		//created direct child objexts
		// ContractorChild obj = new ContractorChild();
		//obj.calculateSalary();
		//FullTimeEmployee_Child obj1 = new FullTimeEmployee_Child();
		//obj1.calculateSalary();
		//___________________________________________________________________________
		
		//same abstraction with polymorphism
		Employee_Parent obj = new ContractorChild();
		obj.calculateSalary();
		Employee_Parent obj1= new FullTimeEmployee_Child();
		obj1.calculateSalary();
		
	}

	int paymentHour = 60;
	
	@Override
	public void calculateSalary() {
		
		int salary = paymentHour * 8;
		System.out.println("The full-time employee salary is: " + salary);
	}

}
