
public class amit2 {
	public static void main(String[] args) {
		 System.out.println("main method started");
		 int a=10,b=0,c;//c=10/0
		 try {
		 c=a/b;//c=10/0
		 System.out.println(c);
		 }
		 catch(Exception e)// ye superclass hai exception handling ka
		 {
			 // catch(ArithmeticException e)
			 System.out.println("can not divide by zero"); 
		 }
		 System.out.print("main method ended");
	 }

}
