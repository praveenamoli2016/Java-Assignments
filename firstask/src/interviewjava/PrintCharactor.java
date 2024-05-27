package interviewjava;

import java.util.Scanner;

public class PrintCharactor {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter charactor : ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		System.out.println(ch);

	}

}
