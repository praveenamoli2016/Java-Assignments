package arrayjava;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int [] a= {6,8,2,4,3,1,5,7};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {
				secondLargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondLargest && a[i]!=largest) {
				
				secondLargest=a[i];
				
			}
			
		}
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("there is no second largest element in the list");
			
		}
		System.out.println("Second largest element is :"+secondLargest);
		
//		int temp;
//		for(int i=0;i<a.length;i++) {
//			
//			for(int j=i+1;j<a.length;j++) {
//				
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//				
//			}
//			
//		}

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Second largest element is :"+a[1]);
	}

}
