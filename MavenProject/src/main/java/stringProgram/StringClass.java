package stringProgram;

public class StringClass {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = new String("Java");
		
		String s4 = "java";
		String s5 = "java";
		
		String s6 = "  Have a Good Day  ";
		
		String keyword1 = new String("Hello World");
		System.out.println(keyword1);
		
		String literalWay1 = "hello ";
		System.out.println(literalWay1);
		
		String literalWay2 = "";
		//length() method to find the size/length of the string
		System.out.println(literalWay1.length());
		
		//charAt() - to return the character of a string based on the index position
		System.out.println(literalWay1.charAt(4));

		//concat() - to combine two string; to add a string at the end of another string
		System.out.println(literalWay1.concat(keyword1));
		
		System.out.println(literalWay1); //output is hello, it cannot be changed, its immutable
		
		//contains() - to check whether a word or character is present in the string
		System.out.println(literalWay1.contains("b"));
		System.out.println(literalWay1.contains("l"));
		
		//toUpperCase() - convert lowercase to uppercase
		System.out.println(literalWay1.toUpperCase());
		
		//toLowerCase() - convert uppercase to lowercase
		System.out.println(literalWay1.toLowerCase());
		
		//isEmpty() - to check whether a string is empty or not
		System.out.println(literalWay1.isEmpty());
		System.out.println(literalWay2.isEmpty());
		
		
		//equals() - to compare 2 strings; java is not equal to Java
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//equalsIgnoreCase() - to compare the string ignoring the case
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s1==s2);   //equals operator checks object reference; its point to 2 references, so output is false
		System.out.println(s4==s5);   //true
		
		//trim() - to remove the leading and trailing space
		System.out.println(s6.trim());
		
		//substring() - to extract a part of the string
		System.out.println(s6.substring(4));  //ve a Good Day
		System.out.println(s6.substring(3, 12));
		
		//
		
		
		
		
		
		
		
		
	}

}
