package interviewjava;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int y;
		System.out.println("Enter year : ");
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not Leap year");
		}

	}

}
