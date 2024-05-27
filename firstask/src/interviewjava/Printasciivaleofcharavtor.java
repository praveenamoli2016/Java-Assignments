package interviewjava;

import java.util.Scanner;

public class Printasciivaleofcharavtor {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter any charactor : ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		int a=ch;
		System.out.println("ASCII value of : "+ch+" " +"is"+a);

	}

}
