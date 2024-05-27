package arrayjava;

import java.util.Scanner;

public class InsertElementInArray2 {

	public static void main(String[] args) {
		
		int size,loc,item,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size in Array :");
		size=sc.nextInt();
		//int a[]=new int[size];
		int a[]=new int[size+1];
		System.out.println("Enter Array element :");
		for ( i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter Array location :");
		loc=sc.nextInt();
		System.out.println("Enter new item :");
		item=sc.nextInt();
		for ( i = size; i >loc; i--) {
			a[i] = a[i-1];
		}
		a[loc]=item;
		size++;
		for ( i = 0; i < size; i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
