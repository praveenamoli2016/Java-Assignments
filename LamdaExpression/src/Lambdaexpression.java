
 interface Interfacelambdaexp2 {
	/*default void m1()
	{
		
	}
	default void m2()
	{
		
	}
	default void m3()
	{
		
	}
	static void m4()
	{
		
	}
	static void m5()
	{
		
	}
	static void m6()
	{
		
	}*/
	//public String toString();
	//public int hashCode();
	void show();//functional interface

}
 class LE implements Interfacelambdaexp2{
	 @Override
	 public void show()
	 {
		 System.out.println("praveen");
	 }
	 
 }
public class Lambdaexpression {
	 public static void main(String[] args){
		 //Interfacelambdaexp2 r=new LE();
		 LE r=new LE();
		 r.show();

}
}
