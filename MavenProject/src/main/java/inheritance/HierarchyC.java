package inheritance;

public class HierarchyC extends HierarchyA {

	
	public void child2()
	{
		System.out.println("Female children of the family");
     }
	public static void main(String[] args) {
		
		HierarchyC obj = new HierarchyC();
		
		obj.child2();
		obj.parents();

	}

}
