package oops;

public class CopyContructor {
 
	int a;String b;
	
	CopyContructor(){
		a=10;b="Learn praveen";
		System.out.println(a+" "+b);
	}
	
	CopyContructor(CopyContructor ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		CopyContructor cc= new CopyContructor();
		CopyContructor cc2= new CopyContructor(cc);
		

	}

}
