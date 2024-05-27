package interviewjava;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter two number : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();b=sc.nextInt();
		System.out.println("Befre swapping : "+a+" "+b);
		
//		temp=a;
//		a=b;
//		b=temp;
		a=a+b;
		b=a-b;
		a=a-b;
			
		System.out.println("After swapping : "+a+" "+b);

	}

}
