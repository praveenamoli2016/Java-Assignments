package oops;

public class ParametrizedConstructor {
	
	int x,y;
	ParametrizedConstructor(int a,int b){		
		x=a;y=b;	
	}
	void show() {
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		
		ParametrizedConstructor p=new ParametrizedConstructor(100, 200);
		p.show();
		
		

	}

}
