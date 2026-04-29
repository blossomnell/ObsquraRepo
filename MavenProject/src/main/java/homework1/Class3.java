//find total salary(basicpay+hra-pf-deduction+bonus)

package homework1;

public class Class3 extends Class2{
    
	double totalSalary;
	//other variables will come from previous classes
	
	public void calculateTotal()
	{
		totalSalary = basicPay + hra - pf - deduction + bonus; 
		
}
}
