import java.util.Scanner;

public class HMJAVA {
	public static void main(String[] args) {
		
		System.out.println("enter range: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int startIndex = 1;
		while(startIndex <= num) {
			System.out.println(startIndex);
			startIndex++;
		}
		
//		for (int i = 1; i <= num; i++) {
//
//			System.out.println(i);
//		}

	}
}