package interviewjava;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int r;
		while(n>0) {
		    r=n%10;
		    sum=sum+r;
		    n=n/10;
			}
          System.out.println(sum);
	}

}
