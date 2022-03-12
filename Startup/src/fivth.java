import java.util.Scanner;

public class fivth extends forth {
	public static void main(String[] args) {
		int marks;
		System.out.print("enter marks:");
		Scanner s = new Scanner(System.in);
		marks=s.nextInt();
		
		if(marks>=60 && marks<=100)
		{
			System.out.print("first div:");
			
		}
		else if(marks>=45 && marks<60)
		{
			System.out.print("second div:");
		}
		else if(marks>=33 && marks<45)	
		{
			System.out.print("third div:");
			
		}
		else
		{
			System.out.print("failed:");
		}
		
	}

}



