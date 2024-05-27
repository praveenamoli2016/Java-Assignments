package arrayjava;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element of Array :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

		System.out.println(" \n Array Length"+" "+a.length);
	}

}
