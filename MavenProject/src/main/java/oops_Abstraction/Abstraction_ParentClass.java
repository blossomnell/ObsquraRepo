package oops_Abstraction;

public abstract class Abstraction_ParentClass {

	public Abstraction_ParentClass() {   //this can be called in child class bcoz this is non parametrized
		System.out.println("This is a constructor"); //this runs when child object is created
	}
	
	//create abstract methods
	//no body for abstract
	
	public abstract void sum(); 
	public abstract String name(String Name);
	public abstract int age(int age);
	public abstract String city(String City);
	
	//create non abstract method
	//instance method
	public void display() {
		System.out.println("Print the non abstract details");
	
}

	
}
//can we create constructor in abstract/parent class?
//