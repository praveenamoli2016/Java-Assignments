package arrayjava;

import java.util.Scanner;

public class ArrangeArrayElementInAccendingOrder {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element in Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(" Array elements ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				//if(a[i]>a[j]) {
					if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i] + " ");
	}
	}

}
