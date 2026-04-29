//calculate hra (5%) and pf (20%)

package homework1;

public class Class2 extends Class1{

	double hra;
	double pf;
	
	public void salaryCalculate()
	{
		hra = 0.05 * basicPay;
		pf = .20 * basicPay;
		
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
     }
}
