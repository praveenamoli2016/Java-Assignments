
               /*multilevel inheritance*/
 class simple6 {
	protected int roll,marks; //private int roll,marks;
	 String name;
	 protected void input()//private void input()
	 {
		 System.out.println("enter roll,name & marks: ");
	 }
	

}
 class simple7 extends simple6
 {
	 void Star()
	 {
		 roll=1;name="ankit";marks=89;
	 
	 System.out.println( roll+" "+name+" " +" "+marks);
	 }
	 
	 
	 public static void main(String[] args) {
		 simple7 r=new simple7();
		 r.input(); r.Star();
	 }
 }
  
  
