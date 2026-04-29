//basicpay, deduction, bonus

package homework1;

public class Class1 {

	double basicPay = 25000;
	double deduction = 4000;
	double bonus = 6000;
	
	public void salary()
	{
		System.out.println("BasicPay: " + basicPay);
		System.out.println("Deduction: " + deduction);
		System.out.println("Bonus: " + bonus);
     }
}

//package homework1;
//
//import java.util.Scanner;
//
//public class Class1 {
//
//    double basicPay;
//    double deduction;
//    double bonus;
//
//    public void salary()
//    {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter Basic Pay: ");
//        basicPay = sc.nextDouble();
//
//        System.out.print("Enter Deduction: ");
//        deduction = sc.nextDouble();
//
//        System.out.print("Enter Bonus: ");
//        bonus = sc.nextDouble();
//    }
//}