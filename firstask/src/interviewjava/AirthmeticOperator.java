package interviewjava;

import java.util.Scanner;

public class AirthmeticOperator {

	public static void main(String[] args) {
		
		int a,b;
		System.out.println("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Addition :"+(a+b));
		System.out.println("Substraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
		System.out.println("Remainder :"+(a%b));
		
		//Relational operator
		System.out.println("true/false :"+(a>b));
		System.out.println("true/false  :"+(a<b));
		System.out.println("true/false  :"+(a>=b));
		System.out.println("true/false  :"+(a==b));
		System.out.println("true/false  :"+(a!=b));
		
		//Logical operator
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(--b);
		

	}

}
