package arrayjava;

import java.util.Scanner;

public class AverageOfArrayElement {

	public static void main(String[] args) {
		
		int a[] = new int[5];

		int sum=0;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element in Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(" Array elements ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		for (int i = 0; i < a.length; i++) {
			sum=a[i]+sum;
		}
		avg=sum/5;
			System.out.println("Addition"+sum+"avg"+avg);
		

	}

}
