package interviewjava;

import java.util.Scanner;

public class CalculateAreaOfCircle {

	public static void main(String[] args) {
		
		final double PI=3.14;
		double area;
		
		int r;
		System.out.println("Enter radious of circle : ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		
		area=PI*r*r;
		System.out.println(area);
		

	}

}
