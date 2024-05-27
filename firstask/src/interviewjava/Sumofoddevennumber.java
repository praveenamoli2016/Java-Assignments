package interviewjava;

import java.util.Scanner;

public class Sumofoddevennumber {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0)
			for(int i=0;i<=n;i=i+2) {
			 System.out.println(i);		
		}

	}

}
