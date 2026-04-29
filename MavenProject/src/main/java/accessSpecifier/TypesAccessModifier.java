package accessSpecifier;

public class TypesAccessModifier {
	
//diff are the 4 accessspecifiers
	
	public void publicMethod() {
		System.out.println("This is a public method");
	}
	
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	
	protected void proMethod() {
		System.out.println("This is a protected method");
	}
	
	void defaultMethod() {
		System.out.println("This is a default method");
	}
	
	
	public static void main(String[] args) {
		
		TypesAccessModifier obj = new TypesAccessModifier();
		obj.publicMethod();
		obj.privateMethod();
		obj.proMethod();
		obj.defaultMethod();
		
	}

}
