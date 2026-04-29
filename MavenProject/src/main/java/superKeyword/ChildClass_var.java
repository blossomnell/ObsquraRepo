package superKeyword;

class ChildClass_var extends ParentClass_var {

	String Color1 = "Green";
	
	public void display()
		{
			    System.out.println("Parent color: " + super.Color1);
			    System.out.println("Child color: " + Color1);
	    }
	
	public static void main(String[] args) {
		
      ChildClass_var obj = new ChildClass_var(); 
      
      //System.out.println("Color is " + obj.Color1);
      obj.display();
	}

}

//When child and parent have same variable name, super is used in child class to access parent variable.
//Parent variable created
//Child creates same variable 
//display() uses the below
//Color1 → child
//super.Color1 → parent
//main() calls display()
//Output printed




























//System.out.println(super.Color1); //goes to parent class and prints the color
//System.out.println(Color1); //we can simply print from here too
