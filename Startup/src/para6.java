
 class para5 {
		int x,y;
		para5(int a,int b)//parameterized
		{
			x=a; y=b;
		}
		para5(int a,String b)//parameterized
		{
			System.out.print(a+" "+b);	
		}

		
		void show()
		{
			System.out.print(x+" "+y);
			
		}
	}
 
	    class para6
	    {
		 public static void main(String[] args) {
			 para5 r=new para5(100,200);
			 para5 r2=new para5(10,"praveen");
			 r.show();
		 
	}

}
