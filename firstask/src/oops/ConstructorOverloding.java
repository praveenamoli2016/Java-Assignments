package oops;

public class ConstructorOverloding {
	int a;
	double b;
	String s;

	ConstructorOverloding() {
		
		a=100;b=45.54;s="praveen";

	}

	ConstructorOverloding(int x) {
		
		a=x;

	}

	ConstructorOverloding(double y, String z) {
		b=y; s=z;

	}

	public static void main(String[] args) {
		
		ConstructorOverloding co=new ConstructorOverloding();
		ConstructorOverloding co2=new ConstructorOverloding(10);
		ConstructorOverloding co3=new ConstructorOverloding(14.36,"sachin");
		System.out.println(co.a+" "+co.b+" "+co.s);
		System.out.println(co2.a);
		System.out.println(co3.b+" "+co3.s);

	}

}
