/*super keyword*/
 class global23 {
	 int a=10;
	 {
		 a=10;
	 }
 }
	 class global22 extends global23
	 {
		 int a=20;
		 void show()
		 {
			 System.out.println(a);
		 } 
	 }
	 class Test111
	 {
		 public static void main(String[] args) {
			 global22 r=new global22();
			 r.show();
		 }
 }
 
	
