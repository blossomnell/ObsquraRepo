package oops_interface;

//right click the package and click create interface
//access specifier interface interfacename
//we cant instantiate but we can create the reference of the interface

public interface Interface_Parent {

	public abstract void sum();//Only abstract methods are implemented in child
	
	public static final int num1 = 25; //final means we cannot change it later
	int num2 = 40; //iit takes as constant or final
	
	public static void display() {
		System.out.println("Print from parent");
	}
	
	public default void display1() {
		System.out.println("Print numbers: " + num1 + " " + num2);
		//num2 = 20; here this is considered as final so we cannot define
	}
	
}
