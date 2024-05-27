package oops;

public class PrivateConstructor {
	
	int a;double b;String c;
	
	private PrivateConstructor(){
		
		a=10;b=30.51;c="praveen";
		System.out.println(a+" "+b+" "+c);
		
	}
	

	public static void main(String[] args) {
		
		PrivateConstructor pc=new PrivateConstructor();

	}

}
