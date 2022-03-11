
 class Test120 {
	 int a;  //0 print hua kyoki 0 hamara int ka default value hota hai
	 Test120(int a)
	 {
		 a=a;
	 }
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		 Test120 r=new Test120(100);
		 r.show();

}

}
