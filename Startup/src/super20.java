class super18{
	
     super18()
	 {
		 System.out.println("hellow viewer");
	 }
}
	 class super19 extends super18
	 {
		super19()
		{
		  super();// ye bydefault hota hai likhe ya na likhe to bhi chalega
			System.out.println("hellow learner");
			//System.out.println(super.a);
		}
	 }
	 class super20
	 {
		 public static void main(String[] args) {
			 super9 r=new super9();
			 r.show();
	 }
	 }
