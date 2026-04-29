package exceptionExample;

public class ExceptionHandling {

	public static void main(String[] args) {
		//arithmetic exception
		//we use try to place exception code
		//try block must be followed by catch or finally
		try {
		int num1 = 50;
		int num2 = 0;
		int division = num1 / num2;
       System.out.println("The div is: " + division);
       
		}
		
		//catch block is used to handle the exception
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception is Handled");
		}
		
		//the finally block is used to execute the important code of the program
		finally {
			System.out.println("Important code executed");
		}
       
		System.out.println("hello");
		
		//array index exception
		try {
			
		int ar[] = { 1,2,3,4,5};
		System.out.println(ar[5]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception Handled");
		}
		finally {
			System.out.println("Important code executed");
		}
		
		//ae / e = variable name holding that error
		//nullpointer exception
//		String val = null;
//		System.out.println(val.length());
		
		
		
	}

}
