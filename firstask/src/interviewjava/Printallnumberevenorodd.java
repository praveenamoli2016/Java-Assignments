package interviewjava;

import java.util.Scanner;

public class Printallnumberevenorodd {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		//for(int i=1;i<=n;i=i+2) {
			for(int i=0;i<=n;i=i+2) {
			 System.out.println(i);		
		}

	}

}
