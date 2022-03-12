               /*by implementing runnable interface*/
 class C39 implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		 System.out.println("my child thread...");
	    }
	}

}
 class C40
 {
	 public void main(String[] args) throws InterruptedException{
		 C39 r=new C39();
		 Thread t=new Thread();
		 t.start();
		 for(int i=1;i<=5;i++)
			{
			 System.out.println("main thread...");
		    }
 }
 }
