package modifierOutsidePackage;

import accessSpecifier.TypesAccessModifier;

public class Outside_modifier extends TypesAccessModifier {

	public static void main(String[] args) {
		
		Outside_modifier obj = new Outside_modifier();
		obj.publicMethod();
		obj.proMethod(); ////outside the package we need to use childclass to call the obj; always thru childclass
		//below both are not accessed from another package
		//obj.privateMethod();
		//obj.defaultMethod();
		
		//parent is TypesAccessModifier
		TypesAccessModifier obj1 = new TypesAccessModifier();
		obj1.publicMethod();
		//no other methods can be accessed
		
	}

}
