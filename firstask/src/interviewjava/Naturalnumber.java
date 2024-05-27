package interviewjava;

import java.util.Scanner;

public class Naturalnumber {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//		}
		int i = 1;
		while( i<=n) {
			System.out.println(i);
			++i;
		}

	}

}
