            /*by extending thread class*/
 class C31 extends Thread {
	 @Override
	 public void run()
	 {
		 try
		 {
			 for(int i=1;i<=5;i++)
			 {
				 System.out.println("praveen");
				 Thread.sleep(1000);
			 }
		 }
		 catch(InterruptedException i)
		 {
			 
		 }
			 

}
  class C32
 {
	 public static void main(String[] args) throws InterruptedException{
		 C31 t=new C31();
		 t.start();
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println("neeraj");
			 Thread.sleep(1000);
		 }
	 }
 }
 }
 



