package interviewjava;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		while(n>0) {	
			n=n/10;
			count++;
		}
       System.out.println(count);
	}

}
