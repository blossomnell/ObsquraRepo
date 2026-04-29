// User Get the pin from User

package encapsulationHomework;

public class User_ChildClass {

	public static void main(String[] args) {
		
		Bank_ParentClass obj = new Bank_ParentClass();
		obj.setPin(1234);
		System.out.println(obj.getPin());
		obj.pinValidation();
	}

}
