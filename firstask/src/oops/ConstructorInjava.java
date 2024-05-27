package oops;

public class ConstructorInjava {

	int a;String name;
//	ConstructorInjava(){//default constructor
//		a=0;name=null;
//	}
	void show() {
		System.out.println(a+" "+name);
	}
	
	public static void main(String[] args) {
		
		ConstructorInjava cij=new ConstructorInjava();
		cij.show();

	}

}
