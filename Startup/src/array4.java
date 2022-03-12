import java.util.Arrays;
import java.util.Scanner;

public class array4 {
	public static void main(String[] args) {
		//int a[]= {10,20,30,40,50};//a[5];
		int a[]=new int[5];
		System.out.print("enter array elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Sorted array element:\n");
		for(int b:a)
		{
		System.out.print(b+" ");
		}
	}
	


}
