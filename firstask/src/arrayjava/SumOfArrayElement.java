package arrayjava;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		
		int a[] = new int[5];

		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
			sum=sum+a[i];
		}
		
		System.out.println("Sum of Array elements : "+sum);

	}

}
