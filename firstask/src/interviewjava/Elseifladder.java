package interviewjava;

import java.util.Scanner;

public class Elseifladder {

	public static void main(String[] args) {
		
		int marks;
		System.out.println("Enter marks: ");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		
	    if(marks>80) {
	    	System.out.println("Topper");
	    }
	    else if(marks>=60 && marks<80) {
	    	System.out.println("First");
	    }
	    else if(marks>=45 && marks<60) {
	    	System.out.println("Second");
	    }
	    else {
	    	System.out.println("Fail");
	    }


	}

}
