package inheritance;

public class HierarchyB extends HierarchyA{

	
	public void child1()
	{
		System.out.println("Male children of the family");
     }
	public static void main(String[] args) {
		
       HierarchyB obj = new HierarchyB();
		
        obj.child1();
		obj.parents();

	}

}
