//Check the addition result is divisible by 10

package superHomework;

public class ChildClass extends ParentClass{
	
	public void divisible()
	{
		int sum = super.addition(40, 25);
		//System.out.println(super.addition(40, 25)); 
		System.out.println("The sum of 2 numbers is: " + sum);
		
		if (sum % 10 == 0) {  //checks whether remainder is zero when we divide by 10
			System.out.println("The sum is divisible by 10");
		}
		else {
			System.out.println("The sum is not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.divisible();
	}

}
