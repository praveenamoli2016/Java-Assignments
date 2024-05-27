package interviewjava;

import java.util.Scanner;

public class CalculateAreaOfRectangle {

	public static void main(String[] args) {
		
		//int l,b,area;
		int side,area;
		System.out.println("Enter value of sides : ");
		Scanner sc=new Scanner(System.in);
		//l=sc.nextInt();
		//b=sc.nextInt();
		
		side=sc.nextInt();
		//area=l*b;
		area=side*side;
		System.out.println("Area of rectangle : "+area);

	}

}
