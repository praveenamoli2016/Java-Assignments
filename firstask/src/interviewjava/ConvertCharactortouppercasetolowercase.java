package interviewjava;

import java.util.Scanner;

public class ConvertCharactortouppercasetolowercase {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter charcter : ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			char ch2=Character.toLowerCase(ch);
			System.out.println(ch2);
		}
		else {
			
			char ch2=Character.toUpperCase(ch);
			System.out.println(ch2);
		}
		

	}

}
