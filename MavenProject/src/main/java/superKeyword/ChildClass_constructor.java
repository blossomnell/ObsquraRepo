package superKeyword;

public class ChildClass_constructor extends ParentClass_constructor {

	//constructors are not inherited
	
	public ChildClass_constructor()
	 {
		super(); //will only call the  non para from parent class
		//So before the child constructor does its own work,Java first goes to the parent constructor.
		//no matter we call or not this one, the statement from parent class gets printed
		//This works automatically only when parent has a non-parameterized constructor available.
		System.out.println("This is printing from child constructor"); //child class printing
	 }
	
	public ChildClass_constructor(int a) //parametrized constructor
	 {
		super(100); //call the parameterized constructor of parent class and pass 100
		System.out.println("The integer in child class is: " + a); //child class
	 }
	
	public static void main(String[] args) {
		
		ChildClass_constructor obj = new ChildClass_constructor(); //constructor invoked
		
		//ParentClass_constructor obj1 = new ParentClass_constructor(); //works if we dont use super()
		ChildClass_constructor obj2 = new ChildClass_constructor(50);//invoked for parametrized
		//In main, we call only child constructor because:
		//When child object is created → parent constructor is automatically called
	}

}
