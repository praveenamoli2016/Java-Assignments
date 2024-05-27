package arrayjava;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		
		//if(a==b) {
			//if(a.equals(b)) {
				if(Arrays.equals(a, b)) {
			System.out.println("Both are equals ");
		}
		else {
			System.out.println("Both are  not equals ");
		}

	}

}
