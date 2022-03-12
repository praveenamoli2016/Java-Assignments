class super48{
	
     super48(int a)
	 {
		 System.out.println("hellow viewer"+a);
	 }
}
	 class super49 extends super48
	 {
		super49()
		{
		  super(100);// ye bydefault nhi hota hai esme likhana padta hai
			System.out.println("hellow learner");
			//System.out.println(super.a);
		}
	 }
	 class super50
	 {
		 public static void main(String[] args) {
			 super49 r=new super49();
		
	 }
	 }


