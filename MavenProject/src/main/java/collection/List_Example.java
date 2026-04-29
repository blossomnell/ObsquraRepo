package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Example {

	public static void main(String[] args) {
		
		List <String> li = new ArrayList<String>(); //create reference bcoz list is an interface
		//List li = new ArrayList(); syntax
		System.out.println(li); //we get empty list
		
		//add() to add elements/objects in a collection
          li.add("Red");
          li.add("White");
          li.add("Blue");
          li.add("Blue");
          li.add("Yellow");
          li.add(null);
          li.add(null);
          System.out.println(li);
          
          //indexOf() to return the index of the object
          System.out.println(li.indexOf("White"));
          System.out.println(li.indexOf("Blue")); //if there is repeated ones, its hows the first one
          
          //lastIndexOf() - 
          System.out.println(li.lastIndexOf("Blue")); //to show the last index of the repeated object
          
          //get() - to retrieve the element in an index position
          System.out.println(li.get(3));
          
          //contains() - to check whether an object is present in the collection
          System.out.println(li.contains("Black"));  //false
          System.out.println(li.contains("Red"));    //true
          
          //isEmpty() is used to check whether a collection (like a List) has any elements or not.
          System.out.println(li.isEmpty()); //false
          
          //size() - to know the length/size of the list/collection
          System.out.println(li.size());
          
          //iterates the collection
          //for loop
          for(int i= 0; i < li.size(); i++) { 
        	  System.out.println(li.get(i));
          }
        //for each loop syntax 
        //for(datatype varname: collectionname){
        //sop(varname);
        //}
          for(String color : li) {   
        		    System.out.println(color);
        		}
        
          // iterator
          Iterator <String> var  = li.iterator(); 
          //while loop
          //hasNExt checks whether there is another element left in the collection
          //. next() - returns the next element in the iteration. ( print the elements)
            while (var.hasNext()) {
      	  
        	  System.out.println(var.next());
          }
        		  
          var.remove();  //removes the last element
          System.out.println(li); 
          
          }
      
         
	}


