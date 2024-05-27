package interviewjava;

import java.util.Scanner;

public class CalculateAreaOfTringle {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter values : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		
		int sp=a+b+c/2;
	double area	=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
	System.out.println(area);

	}

}
