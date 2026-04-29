package oops_interface;

//use implement instead of extends

public class Interface_Child implements Interface_Parent{

	public static void main(String[] args) {
		
		Interface_Child obj = new Interface_Child();
		obj.sum(); 
		obj.display1(); //child inherits methods display and display1 automatically in interface
		
		Interface_Parent.display();   //calls static method using className/interfacename.methodname()
		
		Interface_Parent obj1 = new Interface_Child(); //We create reference because we cannot create object of interface
		obj1.sum();
		obj1.display1();
	}

	//Only abstract methods are implemented in child
	@Override
	public void sum() {
		int a = 10;
		int b = 8;
		int sum = a + b;
		System.out.println("The sum is: " + sum);		
	}

}
