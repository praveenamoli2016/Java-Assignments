package interviewjava;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if(n==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}

	}

}
