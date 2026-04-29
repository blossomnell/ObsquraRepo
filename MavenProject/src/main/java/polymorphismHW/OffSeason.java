//set discount 15%

package polymorphismHW;

public class OffSeason extends OnSeason{

	public void discount(double total)
	{
		//use super to call parent
		super.discount(total);
		
		double discount = total * 0.15;
        double finalTotal = total - discount;
		//printing for child
		System.out.println("Discount amount for offseason  is: " + discount);
		System.out.println("Final amount for offseason is: " + finalTotal);
		
	}
	
	public static void main(String[] args) {
		
		OffSeason obj = new OffSeason();
		obj.discount(15000);
		
		//OnSeason obj1 = new OnSeason();
		//obj1.discount(7000);
		
	}

}
