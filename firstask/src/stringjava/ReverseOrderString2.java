package stringjava;

import java.util.Scanner;

public class ReverseOrderString2 {

	public static void main(String[] args) {
		
//		String s;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string : ");
//		s=sc.nextLine();
//		for(int i=s.length();i>0;--i) {
//			System.out.print(s.charAt(i-1));
//		}
		
		String str="Praveen",str2="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			str2=ch+str2;
			
		}
		System.out.println(str2);

	}

}
