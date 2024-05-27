package interviewjava;

import java.util.Scanner;

public class MakeCalculator {

	public static void main(String[] args) {
	
		int n1,n2,ch,cal;
		System.out.println("Enter numbers : ");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Enter your choise : ");
		
	    ch=sc.nextInt();
	    if(ch==1) {
	    	cal=n1+n2;
	    	System.out.println(cal);
	    }
	    else if(ch==2) {
	    	cal=n1-n2;
	    	System.out.println(cal);
	    }
	    else  if(ch==3) {
	    	cal=n1*n2;
	    	System.out.println(cal);
	    }
	    else {
	    	cal=n1/n2;
	    	System.out.println(cal);
	    }

	}

}
