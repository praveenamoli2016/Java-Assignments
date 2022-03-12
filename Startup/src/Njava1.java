
 class Ljava {//super
	int a,b,c;
	void add()
	{
		a=10; b=20;
		c=a+b;
		System.out.println("sum of two nos"+c);
	}
	void sub()
	{
		a=100; b=20;
		c=a-b;
		System.out.println("sub of two nos"+c);
	}

}
   class Mjava extends Ljava// sub1
   {
	   void multi()
		{
			a=10; b=20;
			c=a*b;
			System.out.println("multiplication of two nos"+c);
		}
		void div()
		{
			a=100; b=20;
			c=a/b;
			System.out.println("division of two nos"+c);
		} 
   }
     class Njava1 extends Mjava //sub2
     {
    	 void rem()
    	 {
    		 a=10;b=4;
    		 c=a%b;
    		 System.out.println("remainder of two nos"+c);
    		 
    	 }
    	 
     
     public static void main(String[] args) {
    	 
  	   Njava1 r=new Njava1();
  	   r.add();r.sub();r.multi();r.div();r.rem();
     }
     }
       
