

class super3 {
    int a=10;
	 {
		 a=10;
	 }
}
	 class super4 extends super3
	 {
		int a=20;
		void show()
		{
			System.out.println(a);
			System.out.println(super.a);//System.out.println(super.a);
		}
	 }
	 class super5
	 {
		 public static void main(String[] args) {
			 super4 r=new super4();
			 r.show();
	 }
	 }

