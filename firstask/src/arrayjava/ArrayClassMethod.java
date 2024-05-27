package arrayjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassMethod {

	public static void main(String[] args) {

		int a[] = new int[5];
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter element in Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(" Array elements ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}

}
