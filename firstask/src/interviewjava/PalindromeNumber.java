package interviewjava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n,r,s=0;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
		    n=n/10;
		}
		if(c==s) {
			System.out.println("PalindromeNumber");
		}
		else {
           System.out.println("Not a PalindromeNumber");
		}

	}

}
