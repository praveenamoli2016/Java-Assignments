
 class Test122 {
	   //0 print hua kyoki 0 hamara int ka default value hota hai
	 Test122()
	 {
		 System.out.println("learn coding"); 
	 }
	 Test122(int a)
	{
		 this(); //this keyword same class ke default cons ko call krne ka kaam krta hai
		System.out.println(a);
	}
	public static void main(String[] args) {
		 Test122 r=new Test122(100);
		 

}


}
