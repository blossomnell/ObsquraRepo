package oops_interface;

public class MultipleInherChild implements MultipleInherParent1, MultipleInherParent2 {

	public static void main(String[] args) {
		MultipleInherChild obj = new MultipleInherChild(); //use childclass object to call the methods
		obj.test();
		obj.display();
		obj.sum();
	}

	@Override
	public void test() {
		System.out.println("Print from test");
	}

	@Override
	public void display() {
		System.out.println("Print from display");
	}

	@Override
	public void sum() {  //same methods in both parents so only one override is created; also only one body
		System.out.println("Print the parent1");
		System.out.println("Print the parent2");
		
	}

}
