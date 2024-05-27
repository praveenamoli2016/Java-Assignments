package interviewjava;

public class FindCountOfAlphament {

	public static void main(String[] args) {
		
		char a[]= {'a','a','b','c','a','c','c','a','d','e','a','e','f','a'};		
		int count=0;
		for(char i='a';i<='z';i++) {
			
			if(i=='a') {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
