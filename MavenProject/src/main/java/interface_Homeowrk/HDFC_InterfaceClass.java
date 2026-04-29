package interface_Homeowrk;

public class HDFC_InterfaceClass implements RBI_Interface{

     public static void main(String[] args) {
		
    	 //HDFC_InterfaceClass obj = new HDFC_InterfaceClass(); //direct calling
    	 //obj.recurringDeposit(50000, 5);
    	 
    	 RBI_Interface obj1 = new HDFC_InterfaceClass(); //created a reference of the interface
    	 obj1.recurringDeposit(50000, 5); 
	}

     @Override
     public void recurringDeposit(double amount, int duration) {
    	 
	    double interest = (amount * rate * duration) / 100 ;
	    double totalAmount = amount + interest;
	    
	   System.out.println("The initial amount is: " + amount);
	   System.out.println("The interest is: " + interest);
	   System.out.println("The total amount is: " + totalAmount);
	  
}
}
