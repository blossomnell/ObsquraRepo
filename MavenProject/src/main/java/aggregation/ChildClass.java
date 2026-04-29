package aggregation;

public class ChildClass {

	String subject;
    int id;
    ParentClass ref;
	
	public ChildClass(String subject, int id, ParentClass ref ) 
	{
		this.subject = subject;
		this.id = id;
		this.ref = ref;
	}
	
	public void display() {
		
		System.out.println("The subject in child class is: " + subject);
		System.out.println("The id in child class is: " + id);
		
		System.out.println("The name in parent class is: " + ref.name);
		System.out.println("The mark in parent class is: " + ref.mark);
		
	}
	
	public static void main(String[] args) {
		
		ParentClass obj1 = new ParentClass("Blossom", 50);
		ChildClass obj = new ChildClass("English", 3, obj1);
		obj.display();
			
	}

}
