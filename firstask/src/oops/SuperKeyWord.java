package oops;

class SuperKeyWord2{
	//int a=10;
	//void show()
	//SuperKeyWord2()
	SuperKeyWord2(int a){
		System.out.println("Hello viewer"+" "+a);
	}
}

class SuperKeyWord3 extends SuperKeyWord2{
	//int a=20;
	//void show() 
	SuperKeyWord3(){
		    //super.show();
		    super(100);
			System.out.println("Hello praveen");
		
//		System.out.println(a);
//		System.out.println(super.a);
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		
		SuperKeyWord3 sk=new SuperKeyWord3();
		//sk.show();

	}

}
