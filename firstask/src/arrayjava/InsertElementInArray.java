package arrayjava;

public class InsertElementInArray {

	public static void main(String[] args) {
		
		int a[]= {10,7,13,17,19};
		
		//int pos=3;
		int index_pos=3;
		int element=50;
		//for(int i=a.length-1;i>index_pos-1;i--) {
			for(int i=a.length-1;i>index_pos;i--) {
			
			a[i]=a[i-1];
		
		}
		//a[pos-1]=element;
		a[index_pos]=element;
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]+" ");
		}

	}

}
