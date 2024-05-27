package interviewjava;

import java.util.Scanner;

public class Ifelsestatement {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
	    if(n>=0) {
	    	System.out.println("+ve number");
	    }
	    else {
	    	System.out.println("-ve number");
	    }

	}

}
