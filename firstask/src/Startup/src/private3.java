
 class private3 {
	 int a; double b; String c;
	 private private3() //contr hmara A hai kisi other class me exit nhi hoga
	 {
		 a=10;  b=30.56; c="praveen";
		 System.out.println(a+" "+b+" "+c+" ");
	 }
	 
	 public static void main(String[] args) {
		 private3 r=new private3();

}
}