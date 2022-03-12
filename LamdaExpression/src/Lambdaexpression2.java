interface Interfacelambdaexp3 {

	void show();//functional interface

}
 
public class Lambdaexpression2 {
	 public static void main(String[] args){
		 Interfacelambdaexp3 r=new Interfacelambdaexp3() {
			
			@Override
			public void show() {
					System.out.println("praveen");
				
			}
		};
		 r.show();
}
}


