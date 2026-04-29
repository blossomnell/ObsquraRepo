//One method to set pin from „User‟ class and 
//Another method [Valid pins – 1001, 1234, 1212] 
//Pin number is private

package encapsulationHomework;

public class Bank_ParentClass {

	private int pin;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	//validate the pin
	public void pinValidation() {
		
		if (pin == 1001 || pin == 1234 || pin == 1212) {
			System.out.println("Valid Pin Entered");
		}else {
				System.out.println("Invalid Pin Entered");
			}
		}
	}

