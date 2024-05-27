package arrayjava;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter element in Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int a2[]=Arrays.copyOf(a, 6);
		
		//int a2[5]=100;
		System.out.println(" Copy of Arrays2" );
		
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]+" ");
		}

	}

}
