package stringjava;

public class StringDemo {

	public static void main(String[] args) {
		
		String s="praveen";
		String s2=new String("abc");
		System.out.println(s.length());
		System.out.println(s2.length());
		StringBuffer sb=new StringBuffer("praveen");
		String s3=new String(sb);
		System.out.println(s3);
		System.out.println(s3.length());
		
		StringBuilder sb2=new StringBuilder("praveen");
		String s4=new String(sb2);
		System.out.println(s4);
		System.out.println(s4.length());
		
		//byte[] b= {101,102,103};
		char [] c= {'a','b','c'};
		String str=new String(c);
		System.out.println(str);

	}

}
