
@FunctionalInterface
interface Interfacelambdaexp4 
{
	void show();//Functional interface
}
@FunctionalInterface
interface Interfacelambdaexp5 extends  Interfacelambdaexp4
{
	void show();//Functional interface
	//void show2();//it is not Functional interface
}
public class Lamdaexpression3 {
	 public static void main(String[] args){
			
			 Interfacelambdaexp4 r=() -> System.out.println("praveen");
				r.show();
}
}




