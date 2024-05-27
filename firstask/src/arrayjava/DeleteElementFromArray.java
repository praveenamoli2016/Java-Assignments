package arrayjava;

public class DeleteElementFromArray {

	public static void main(String[] args) {

		int a[] = { 10, 7, 13, 17, 19 };

		int delete_element = 40;
		int count=0;
		
		for (int i =0;i<a.length;i++) {
			
			if(delete_element==a[i]) {
				for (int j =i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				count=count+1;
				  break;
			}
          
		}
      if(count==0) {
    	  System.out.println("element not found");
      }
      else {
    	  System.out.println("Element deleted successfully");
      }
	
	for(int i=0;i<a.length-1;i++) {
		System.out.println(a[i]+" ");
	}

}
}
