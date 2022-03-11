
class global224 {
	   void show()
	 {
		 System.out.println("hello viewer"); 
	 }
	
 }
	 class global225 extends global224
	 {
		 
		 void show()
		 {
			 super.show();// super class ke member ko access krne ke liye
			 System.out.println("hello learner");

		 } 
	 }
	 class Test113
	 {
		 public static void main(String[] args) {
			 global225 r=new global225();
			 r.show();
			 
		 }
	 }












