package inheritance;

public class Dog extends Animal {
	
	public void bark()
	{
	System.out.println("Barks loud");
	}

	public static void main(String[] args) {
		
		Dog obj = new Dog();  // object invoked
		obj.bark();
		obj.eating();
		
	}

}
