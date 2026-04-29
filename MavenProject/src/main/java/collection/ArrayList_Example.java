package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {

	public static void main(String[] args) {
	
		ArrayList<String> alist= new ArrayList<String>(); //we can create object bcoz arraylist is a class
		 
		System.out.println(alist);
		alist.add("Lion");
		alist.add("Dog");
		alist.add("Cat");
		alist.add("Cow");
		alist.add("Owl");
		alist.add("Tiger");
		alist.add("Pig");
		System.out.println(alist);
		
		ArrayList<String> alist1= new ArrayList<String>();
		alist1.add("Apple");
		alist1.add("Orange");
		alist1.add("Plum");
		alist1.add("Avacado");
		alist1.add("Raspberry");
		alist1.add("Prune");
		System.out.println(alist1);
		
		//addAll() - add another list to the current one
		alist.addAll(alist1);
		System.out.println(alist);
		
		//containsAll() - checking list elements are available in another list
		System.out.println(alist1.containsAll(alist)); //false
		System.out.println(alist.containsAll(alist1)); //true
		
		//remove() - to remove elements from the list
		alist.remove(3);
		System.out.println(alist);
		
		alist.remove("Dog");
		System.out.println(alist);
		
		alist.removeAll(alist1);
		System.out.println(alist);
		
		alist1.remove("Prune");
		System.out.println(alist1);
		
		
	}

}
