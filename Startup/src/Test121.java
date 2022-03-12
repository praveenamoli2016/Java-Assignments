
 class Test121 {
	 int a;  //0 print hua kyoki 0 hamara int ka default value hota hai
	 Test121(int a)
	 {
		 this.a=a;
	 }
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		 Test121 r=new Test121(100);
		 r.show();

}

}

