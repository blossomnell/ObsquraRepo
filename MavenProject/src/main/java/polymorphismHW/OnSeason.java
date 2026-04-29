//set discount 40%

package polymorphismHW;

public class OnSeason {
 
	public void discount(double total)
	{
		double discount = total * 0.40;
		double finalTotal = total - discount;
		
		System.out.println("Discount amount for onseason is: " + discount);
		System.out.println("Final amount for onseason is: " + finalTotal);
		
	}
}
