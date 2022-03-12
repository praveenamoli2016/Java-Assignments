import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		//int a[]= {10,20,30,40,50};//a[5];
		int a[]=new int[5];
		System.out.print("enter array elements");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.print("\n array elements");
		for(int b:a)
		{
		System.out.print(b+" ");
		}
	}
	

}
