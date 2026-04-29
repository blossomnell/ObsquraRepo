package encapsulation;

public class ChildClass {

	public static void main(String[] args) {
		ParentClass obj = new ParentClass();
		
		obj.setName("Blossom");
		System.out.println(obj.getName());
		
		obj.setRollNumber(10);
		System.out.println(obj.getRollNumber());
		
		//ChildClass obj1 = new ChildClass();
		obj.setSubject("Maths");
		System.out.println(obj.getSubject());
		
		obj.setMark(55);
		System.out.println(obj.getMark());

	}

}
