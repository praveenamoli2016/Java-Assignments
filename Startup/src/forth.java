import java.util.Scanner;

public class forth {
	public static void main(String[] args) {
		int pwd;
		System.out.print("enter pwd:");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==2013)
		{
			System.out.print("my name:=akhilesh:");
			System.out.print("my age:=28");
			System.out.print("my contact:=7905954085");
			
		}
		else
		{
			System.out.print("sorry! wrong pwd:");
		}
		
	}

}
