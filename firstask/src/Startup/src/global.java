/*super keyword*/
 class global {
	 int a=10;
	 {
		 a=10;
	 }
 }
	 class global2 extends global
	 {
		 int a=20;
		 void show()
		 {
			 System.out.println(a);
		 } 
	 }
	 class Test11
	 {
		 public static void main(String[] args) {
			 global2 r=new global2();
			 r.show();
		 }
 }
 
	
