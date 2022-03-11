                    /*simple inheritance*/
 class simple {
	 int roll,marks;
	 String name;
	 void input()
	 {
		 System.out.println("enter roll,name & marks: ");
	 }
	

}
 class simple2 extends simple
 {
	 void Star()
	 {
		 roll=1;name="ankit";marks=89;
	 
	 System.out.println( roll+" "+name+" " +" "+marks);
	 }
	 
	 
	 public static void main(String[] args) {
		 simple2 r=new simple2();
		 r.input(); r.Star();
	 }
 }
 
 
