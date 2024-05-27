package arrayjava;

import java.util.Scanner;

public class SearchOfArrayElement {

	public static void main(String[] args) {
		
		int a[] = new int[5];

		int n,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element in Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(" Array elements ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		System.out.println("Enter Search of Array elements: ");
		n=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=n) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Item found"+count+"times");
		}
		else {
			System.out.println("Item not found");
		}

	}

}
