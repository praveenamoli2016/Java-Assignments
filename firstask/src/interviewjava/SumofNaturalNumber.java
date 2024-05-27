package interviewjava;

import java.util.Scanner;

public class SumofNaturalNumber {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//               sum=sum+i;		
//		}
   //     System.out.println(sum);
		int i = 1;
		while( i<=n) {
			sum=sum+i;
			i++;
			
		}
        System.out.println(sum);

	}

}
