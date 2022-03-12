package yogi;

 class C10 {
	protected void show()
	 {
		 System.out.println("learn coding...!");
	 }
}
	 class C11 extends C10//same class bhi access kr payega other class bhi kr payega
	        {
	public static void main(String[] args) {
		C11 r=new C11();
		r.show();

}

}
