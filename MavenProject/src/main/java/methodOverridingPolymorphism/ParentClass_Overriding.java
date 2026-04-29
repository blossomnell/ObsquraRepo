package methodOverridingPolymorphism;

public class ParentClass_Overriding {
	
	//Parent class - 4 methods
	//Child class → overrides these 4 methods
	
   public void display() 
   {
	   System.out.println("This is from parent class");
   }
   
   public int sum(int a, int b) 
   {
	   int sum = a + b;
	   return sum;  //use return so no printing here
   }
   
   public void name(String name) 
   {
	   System.out.println("Name is: " + name);
   }
   
   public void sub(int a, int b) 
   {
	   int sub = a - b;
	   System.out.println("The subtraction value is: " + sub);
   }
   
}
