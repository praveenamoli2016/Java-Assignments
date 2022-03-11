
 class global221 {
	 int a=10;
	 {
		 a=10;
	 }
	
 }
	 class global222 extends global221
	 {
		 int a=20;
		 void show()
		 {
			 System.out.println(a);
			 System.out.println(super.a);
		 } 
	 }
	 class Test112
	 {
		 public static void main(String[] args) {
			 global222 r=new global222();
			 r.show();
			 
		 }

}
