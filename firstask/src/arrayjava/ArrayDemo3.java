package arrayjava;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		String a[]= {"Learn","coding","praveen","developer"};
		int b[]= {10,20,30,40};
		System.out.println("toString()"+Arrays.toString(a));
		System.out.println("asList()"+Arrays.asList(b));
		
		int arr[][]= {{10,20},{30,40}};
		System.out.print("deepToString()"+Arrays.deepToString(arr));

	}

}
