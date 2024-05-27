package interviewjava;

import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
