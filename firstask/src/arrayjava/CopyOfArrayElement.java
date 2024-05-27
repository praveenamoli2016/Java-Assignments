package arrayjava;

import java.util.Scanner;

public class CopyOfArrayElement {

	public static void main(String[] args) {
		
		int a[] = new int[5];

		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of First Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("First Array elements ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		System.out.print("\n Enter element of 2nd Array  ");
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
			System.out.println(b[i] + " ");
		}

	}

}
