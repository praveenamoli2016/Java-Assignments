
class global230 {
	   global230(int a)
	 {
		 System.out.println("hello viewer"+a); 
	 }
	
 }
	 class global232 extends global230
	 {
		 
		 global232()
		 {
			 
		        super(100);// parameterized ke case me ye likhna compulsary hota hai
			 System.out.println("hello learner");

		 } 
	 }
	 class Test115
	 {
		 public static void main(String[] args) {
			 global232 r=new global232();
	
			 
		 }
	 }


