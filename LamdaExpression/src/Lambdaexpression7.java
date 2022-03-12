
public class Lambdaexpression7 {
	 public static void main(String[] args){
		 /*Runnable r=()-> 
		 {
			 for(int i=1;i<4;i++)
			 System.out.println("praveen");
		 System.out.println(Thread.currentThread().getName());
		 };*/
		 Thread t=new Thread(()-> 
		 {
			 for(int i=1;i<4;i++)
			 System.out.println("praveen");
		 System.out.println(Thread.currentThread().getName());
		 });
		 t.start();
	 }

}


