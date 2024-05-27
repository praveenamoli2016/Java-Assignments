package arrayjava;

public class MaxElementOfArray {

	public static void main(String[] args) {
		
		int a[]= {10,7,13,17,19};

		//int max=a[0];
		int min=a[0];

		
		for(int i=1;i<a.length;i++) {
				
//				//if(max<a[i]) {
//					if(a[i]>max) {
//					max=a[i];
//				}
					
					//if(max<a[i]) {
					if(a[i]<min) {
					min=a[i];
				}
				
			}
       	//System.out.println("Max element is :"+max);
     	System.out.println("Min element is :"+min);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
