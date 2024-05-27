package interviewjava;

import java.util.Scanner;

public class CalculatePowerofNumber {

	public static void main(String[] args) {
		int n,p;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter power : ");
		p=sc.nextInt();
		int result = 1;
		for(int i=1;i<=p;i++) {
			result=result*n;
		}
		System.out.println(result);

	}

}
