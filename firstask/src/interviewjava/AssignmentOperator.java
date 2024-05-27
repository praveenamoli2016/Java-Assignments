package interviewjava;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		//Simple
		int a;
		a=10;
		System.out.println(a);
		
		//Compound
		a+=10;//(a=a+10)
		System.out.println(a);
		
		a-=10;//(a=a-10)
		System.out.println(a);
		
		//Ternary operator
		int b=20,max;
		max=(a>b)?a:b;
		System.out.println(max);
		
		int c=30;
		max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(max);

	}

}
