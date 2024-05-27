package arrayjava;

import java.util.Scanner;

public class KthLargestValueOfArray {

	public static void main(String[] args) {
		
	
		int a[]= {10,7,13,17,19};
//		int size;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size :");
//		size=sc.nextInt();
//		int a[]=new int [size];
		
		System.out.println("Enter number of elements :");
		int temp=a[0];
		int k=2;
		
//		for(int i=0;i<a.length;i++) {
//			
//			a[i]=sc.nextInt();
//		}
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			if(i==k-1) {
				
				System.out.println("Second largest element is :"+a[i]);
		}

		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}


	

}
