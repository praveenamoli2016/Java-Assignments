package stringjava;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="praveen";
		String str2="java";
		int a=10;
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.charAt(0));
		System.out.println(str.contains("p"));
		System.out.println(str.startsWith("pra"));
		System.out.println(str.endsWith("pra"));
		System.out.println(str.toUpperCase());
		System.out.println(String.valueOf(a));
		
		char [] c=str.toCharArray();
		System.out.println(c);
//		System.out.println(str+str2);
//		System.out.println(str+10);
//		System.out.println(str+10+20);
//		System.out.println(10+str+20);
//		System.out.println(10+20+str+str2);
//		System.out.println(str+20/10);
//		System.out.println(str+20*10);
//		//System.out.println(str+20-10);
//		System.out.println(str.concat(str2));
//		System.out.println(String.join(str2, str));
//		System.out.println(str.subSequence(3, 5));
//		
//		String s="this is demo";
//		System.out.println(s.replace("i", "p"));
//		System.out.println(s.replaceFirst("is", "was"));
//		System.out.println(s.replaceAll("is", "was"));
//		System.out.println(s.replaceAll("is(.)", "was"));
//		System.out.println(s.replaceAll("is(.*)", "was"));
//		
		
		

	}

}
