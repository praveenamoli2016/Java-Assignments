package stringjava;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//StringBuffer sb=new StringBuffer();
		StringBuffer sb=new StringBuffer("praveen");
		
	      //sb.setCharAt(4, 'c');
		//sb.setLength(4);
	     // System.out.println(sb);
		
		sb.ensureCapacity(100);
		sb.append("hello");
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		//sb.ensureCapacity(100);
//		System.out.println(sb.capacity());
		
		
		//System.out.println(sb.insert(3, "aa"));
		
		//System.out.println(sb.replace(3, 6, "m"));
		
		//System.out.println(sb.reverse());
		//System.out.println(sb.subSequence(3, 6));
		
		//System.out.println(sb.substring(3, 6));
		//StringBuffer sb2=new StringBuffer("praveen");
		//StringBuffer sb2=sb.append("hi");
		
		//System.out.println(sb.equals(sb2));
		
		//StringBuffer sb=new StringBuffer("praveen tiwari");
		//StringBuffer sb=new StringBuffer(1000);
		//System.out.println(sb.capacity());
		
		//System.out.println(sb.length());
		//System.out.println(sb.append("hi"));
		//System.out.println(sb.delete(2, 5));
		
//		sb.append("hello");
//		System.out.println(sb.capacity());
//		
//		sb.append("praveen tiwari");
//		System.out.println(sb.capacity());
		
		

	}

}
