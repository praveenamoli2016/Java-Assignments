package firstask;
                /*scope of variable*/
//a variable can be declared and defined inside a class,method or block.
//it defines the scope of variable 
public class VARIABLE0 {
	int a = 10; // Instance variable
	
	static double b = 20.5; // static variable
	
	public static void main(String[] args) {
		boolean c = true ; // local variable
    
		 
		VARIABLE0 s= new VARIABLE0();
		System.out.println(s.a+" "+b+" "+c);
		
	 }

}
