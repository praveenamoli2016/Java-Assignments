 class H {
	 int a; String b; boolean c;
	 H()//default
	 {
		a=100; b="ankit" ; c=true;
	 }
	 void disp()
	 {
		 System.out.print(a+" "+b+" "+c);
	 }
 }
 class G
 {
	 public static void main(String[] args) {
	 H ref =new H();
	 ref.disp();
	

}
 }
 
