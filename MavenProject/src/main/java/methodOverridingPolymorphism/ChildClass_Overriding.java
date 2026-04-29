package methodOverridingPolymorphism;

public class ChildClass_Overriding extends ParentClass_Overriding {

	public void display() 
	   {
		   super.display();    //call parent method display() & print parent message
		   System.out.println("This is from child class"); //prints child message
	   }
	
	public int sum(int a, int b) 
	   {
		   System.out.println(super.sum(10, 4)); //goes to parent class method
		   int sum = a + b;  //child class uses its own values
		   return sum;       //so it will be printed in main
	   }
	
	public void name(String name) 
	   {
		   super.name("Blossom"); //This calls parent class method
		   System.out.println("Name is: " + name); //This is child class print
	   }
	
	@Override //right click in the prgm and select source and select override/implement method
	public void sub(int a, int b) {
		super.sub(5, 2); //we can give values and give a sys statement so 2 sub methods will run otherwise it will take the same vlaues from main	
	    //Calls parent class method
		
		int sub = a-b;   //Now child uses values from main method
	    System.out.println("The subtraction value is: " + sub); //prints child class value
	}
	
	
	public static void main(String[] args) {
		ChildClass_Overriding obj = new ChildClass_Overriding();  //object is created
		
		obj.display();                       //Calls child display()
		System.out.println(obj.sum(12, 4));  //Calls child sum(12,4)
		obj.name("Thomas");
		obj.sub(44, 20);

	}

	

}
