//recurringDeposit which can accept the amount and duration
//create abstract method
//Interest rate is defined in RBI interface

package interface_Homeowrk;

public interface RBI_Interface {

	double rate = 4.5f;
	public abstract void recurringDeposit(double amount, int duration); //body in child class
	
}
