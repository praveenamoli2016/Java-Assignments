                       /*super keyword*/
 class super26 {
       int a=10;
	 {
		 a=10;
	 }
 }
	 class super27 extends super26
	 {
		int a=20;
		void show()
		{
			System.out.println(a);
			System.out.println(super.a);
		}
	 }
	 class Test
	 {
		 public static void main(String[] args) {
			 super26 r=new super26();
			 r.show();
	 }
	 }
	 
	 
 
	




