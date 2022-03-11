             /*by extending thread class*/
 class C27 extends Thread {
	 public void run()
	 {
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println("praveen");
		 }
	 }

}
 class C26
 {
	 public static void main(String[] args) {
		 C27 t=new C27();
		 t.start();
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println("neeraj");
		 }
	 }
 }
