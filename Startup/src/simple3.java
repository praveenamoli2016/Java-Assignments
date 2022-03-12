
                  /*simple inheritance*/
 class simple3 {
	protected int roll,marks; //private int roll,marks;
	 String name;
	 protected void input()//private void input()
	 {
		 System.out.println("enter roll,name & marks: ");
	 }
	

}
 class simple4 extends simple3
 {
	 void Star()
	 {
		 roll=1;name="ankit";marks=89;
	 
	 System.out.println( roll+" "+name+" " +" "+marks);
	 }
	 
	 
	 public static void main(String[] args) {
		 simple4 r=new simple4();
		 r.input(); r.Star();
	 }
 }
 
 

