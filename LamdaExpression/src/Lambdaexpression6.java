
/*class Mythread implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("praveen");
		System.out.println(Thread.currentThread().getName());
	}
}*/

public class Lambdaexpression6 {
	 public static void main(String[] args){
		 Runnable r=new  Runnable() {
		 @Override
		 public void run()
		 {
			 System.out.println(Thread.currentThread().getId());
		 }
		 
		};
		 Thread t=new Thread(r);
		 t.start();
	 }

}
