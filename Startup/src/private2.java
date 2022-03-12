
public class private2 {

	 int a; double b; String c;
	 private private2() //contr hmara A hai kisi other class me exit nhi hoga
	 {
		 a=10;  b=30.56; c="praveen";
		 System.out.println(a+" "+b+" "+c+" ");
	 }
	 
	 public static void main(String[] args) {
		 private2 r=new private2();

}
}