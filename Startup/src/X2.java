 class G4 {
	 int a; String b; boolean c;
	 /*G2()//default
	 {
		a=100; b="ankit" ; c=true;
	 }*/
	 void disp()
	 {
		 System.out.print(a+" "+b+" "+c);//jab bhi compiler apne se default
		            // default cons add krta hai vo by default value hi compile add kr deta hai to vo bydefault value hamare kisi kam ka nhi hai esi karan hm apna khud ka con banate hai 
	 }
 }
 class X2
 {
	 public static void main(String[] args) {
	 G2 ref =new G2();
	 ref.disp();
	

}


}
