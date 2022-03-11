            /*by extending thread class*/
 class C37 extends Thread {//esme single thread hai esliye esme 10 sec lag rahe hai
	 public void fun()//ye override method to hainhi
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
  class C38
 {
	 public void main(String[] args) throws InterruptedException{
		 C37 t=new C37();
		 t.fun();
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println("neeraj");
			 Thread.sleep(1000);
		 }
	 }
 }
 }
 
