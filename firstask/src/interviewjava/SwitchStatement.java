package interviewjava;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int a,b,ch;
		System.out.println("Enter numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter user choice: ");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1: System.out.println("Sum : "+(a+b));
		break;
		
		case 2: System.out.println("Sub : "+(a-b));
		break;
		
		case 3: System.out.println("Multi : "+(a*b));
		break;
		
		case 4: System.out.println("Div : "+(a/b));
		break;
		
		default : System.out.println("Invalid choice");
		
		
		}
		

	}

}
