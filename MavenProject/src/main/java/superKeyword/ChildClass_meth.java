package superKeyword;

public class ChildClass_meth extends ParentClass_meth {

	//methods are inherited
	
	public void display1()
	 {
		 super.display();  //go to parent class & call the parent method display()
		 System.out.println("This is from Child Class"); // normal print statement in child class
		 System.out.println(super.sum(4, 8)); //go to parent class & call method sum(4, 8)
		 this.display2("Blossom"); //stay in child & call current child class method display2	 
	 }
	
	public void display2(String name)
	 {
		System.out.println("Name is " + name);
		super.show(); //it goes to parent class method show():
	 }
	
	public static void main(String[] args) {
		
		ChildClass_meth obj = new ChildClass_meth();
		
	    //obj.display(); belongs to parent class;bUT we already called it using super.display() inside display1()
		obj.display1();
	}

}

//So now child class has
//its own methods: display1(), display2()
//inherited parent methods: display(), sum(), show()
//That means child class can use all 5 methods.

