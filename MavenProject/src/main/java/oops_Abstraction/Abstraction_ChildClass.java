package oops_Abstraction;

public class Abstraction_ChildClass extends Abstraction_ParentClass {

	
	public static void main(String[] args) {
		
		Abstraction_ChildClass obj = new Abstraction_ChildClass(); //can access both parent and child methods
		obj.sum();
		System.out.println("The name is: " + obj.name("Blossom"));
		System.out.println("The age is: " + obj.age(15));
		System.out.println("The city is: " + obj.city("Austin"));
		obj.display();
		System.out.println("The fruit is: " + obj.fruit("Apple"));
		
		//create obj for parent class
		//Abstraction_ParentClass obj1 = new Abstraction_ParentClass(); //error says cannot instantiate
		//Cannot create object of abstract class
		//we can create an obj using only the child class
		Abstraction_ParentClass obj1 = new Abstraction_ChildClass();  //can access only parent methods
		obj1.sum();
		System.out.println("The name is: " + obj1.name("Blossom"));
		System.out.println("The age is: " + obj1.age(15));
		System.out.println("The city is: " + obj1.city("Austin"));
		obj1.display();	
		//System.out.println("The fruit is: " + obj1.fruit("Apple"));
		//cannot access child class property by creating abstract/parent class reference
	}

	@Override
	public void sum() {
		int a = 30;
		int b = 20;
		int sumTotal = a + b;
		System.out.println("The sum is: " + sumTotal);
	}
	
	@Override
	public String name(String Name) {
		return Name;
	}
	
	@Override
	public int age(int age) {
		return age;	
	}

	@Override
	public String city(String City) {
		return City;
	}
	
	public String fruit(String Fruit) {  //parent doesnt abt this method; this is only in child
		return Fruit;
		
	}
}
