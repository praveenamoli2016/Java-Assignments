package arrayjava;

import java.util.Scanner;

public class MirrorMatrix {

	public static void main(String[] args) {
		
		int[][]a = new int [2][2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of Array :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
			a[i][j] = sc.nextInt();
		}}
		System.out.print("Array Matrix: \n");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
		
			System.out.print(a[i][j] + " ");
		}
			System.out.println("\n ");
		}
		System.out.print("Mirror Matrix: \n");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 1; j >=0; j--) {
//		
//			System.out.print(a[i][j] + " ");
//		}
			
			for (int i = 1; i >=0 ;i--) {
				for (int j = 0; j <a.length; j++) {
			
				System.out.print(a[i][j] + " ");
			}
			System.out.println("\n ");
		}
	}

}
