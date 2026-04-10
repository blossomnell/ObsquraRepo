package stringProgram;

public class BufferBuilder {

	public static void main(String[] args) {
		
     StringBuffer s = new StringBuffer("Hello");
     StringBuilder s1 = new StringBuilder("Hi");
     
     System.out.println(s);
     System.out.println(s1);
     
     //insert() - to insert a new word to the string based on index position
     System.out.println(s.insert(5, " World"));
     
     //append() - to add a string at the end of another/current string
     System.out.println(s.append(" Good Day"));  //s already became Hello World. So now it becomes Hello World Good Day
     System.out.println(s1.append(" Blossom"));
     System.out.println(s.append(" Blossom"));
     
     //replace() - to replace a string/character in a string based on index position
     System.out.println(s.replace(16,20," Evening"));
     
     //delete() -  to delete the string based on the index position
     System.out.println(s.delete(16,24));
     
     
     //reverse() - to reverse a string
     System.out.println(s1.reverse());
     
     
	}

}
