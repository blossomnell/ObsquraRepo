package collection;

import java.util.HashSet;
import java.util.Set;

public class Interface_Set {
	
	public static void main(String[] args) {

	Set<String> name = new HashSet<String>(); //set is an interface so only reference
	
	name.add("Rose");
	name.add("Tulip");
	name.add("Jasmine");
	name.add("Lilly");
	name.add("Tulip");
	name.add(null);
	name.add(null);
	
	System.out.println(name);
	//the output is unordered/non index based
	//so we cannot use any index based methods in set
	//cannot store multiple null elements
	
	//remove an element
	name.remove("Lilly");
	System.out.println(name);
	
	//clear method
	name.clear();
	System.out.println(name);
}
}