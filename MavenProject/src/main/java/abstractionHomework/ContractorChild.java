//inherits all properties from its parent Employee
//multiply the value of payment per hour with given working hours

package abstractionHomework;

public class ContractorChild extends Employee_Parent{
	
    //Salary = payperhr * workinghours
	//contractor only few hours or doesnt have fixed hours
	
	int paymentHour = 50;
	int workingHour = 4; 
	
	@Override
	public void calculateSalary() {
		
		int salary = paymentHour * workingHour;
		System.out.println("The contractor salary is: " + salary);
	}

}
