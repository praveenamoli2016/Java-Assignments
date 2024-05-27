package interviewjava;

import java.util.Scanner;

public class CheckNumberIsDivisbleBy5 {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num%5==0) {
			System.out.println("Number is divisble by 5");
		}
		else {
			System.out.println("Number is not divisble by 5");
		}

	}

}
