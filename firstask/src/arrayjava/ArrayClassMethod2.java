package arrayjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassMethod2 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter element in Array1 :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter element in Array2 :");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		boolean bo=Arrays.equals(a, b);
		System.out.println(" Is Arrays are equal"+bo);
	

	}

}
