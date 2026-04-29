package exceptionExample;

public class ThrowThrows {

	public static void main(String[] args) throws Exception {
		
		int age = 12;
		if (age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new Exception("Not Eligible");
		}

	}

}
