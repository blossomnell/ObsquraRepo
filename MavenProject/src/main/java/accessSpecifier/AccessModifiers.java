package accessSpecifier;

public class AccessModifiers extends TypesAccessModifier{

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicMethod();
		obj.proMethod();
		obj.defaultMethod();
		//obj.privateMethod();
		//we cannot execute the private method unless its converted into protected

	}

}

