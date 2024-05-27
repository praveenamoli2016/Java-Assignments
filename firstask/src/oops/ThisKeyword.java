package oops;


public class ThisKeyword {
	
	ThisKeyword(){
		
		this(10);
		//System.out.println("Learn praveen");
	}
	
	ThisKeyword(int a){
		//this();
		System.out.println(a);
	}
	
//	int a;
//	ThisKeyword(int a){
//		this.a=a;
//	}
//	
//	void show() {
//		//System.out.println(this);
//		System.out.println(a);
//	}

	public static void main(String[] args) {
		
		ThisKeyword tk=new ThisKeyword();
		//ThisKeyword tk=new ThisKeyword(100);
		//System.out.println(tk);
		//tk.show();

	}

}

