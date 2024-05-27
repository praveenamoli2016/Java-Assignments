package interviewjava;

import java.util.Scanner;

public class AverageMarksOfFiveSubjets {

	public static void main(String[] args) {
		
		int a,b,c,d,e;
		System.out.println("Enter marks : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();d=sc.nextInt();e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println(sum);
		
		double avg=sum/5;
		System.out.println(avg);

	}

}
