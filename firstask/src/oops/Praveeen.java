package oops;

import java.util.Scanner;

interface client{
	
	void input();
	void output();
	
}




public class Praveeen implements client {
	
	String name; double sal;
	
	@Override
	public void input() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter username :");
	name=sc.nextLine();
	
	System.out.println("Enter salary :");
	sal=sc.nextDouble();
	
		
	}

	@Override
	public void output() {
		
		System.out.println(name+" "+sal);
		
	}
	
	public static void main(String[] args) {
		
		client c=new Praveeen();
		c.input();
		c.output();
		

	}

	

}
