                     /*Exception Handling*/
 class amit
{
	 public static void main(String[] args) {
		 System.out.print("main method started");
		 int a=10,b=0,c;//c=10/0
		 try {
		 c=a/b;//c=10/0
		 System.out.println(c);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e); 
		 }
		 System.out.print("main method ended");
	 }
}

/*public class exception {

}*/
