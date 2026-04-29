package exceptionExample;
//not in the syllabus

public class CustomException {

	public static void main(String[] args) throws MyException {
		
		int age = 12;
		if (age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new MyException("Not Eligible");
		}

	}

}
