package finalKeyword;

public class Final {

	public final void finalMethod() {
		System.out.println("this is the final method");
	}
	
	public static void main(String[] args) {
	
	 final int num = 5;
		//num = 6; //error is shown bcoz when we give final we cannot change the value of num
	 
	  System.out.println(num);
		

	}

}
