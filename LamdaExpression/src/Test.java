import java.util.function.Predicate;

public class Test {
	public static void main(String[] args){
		/*Predicate<String>isAlongword=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length()>10;
			}
		};*/
		Predicate<String>isAlongword= t->t.length()>10;
			String s="successfully";
			boolean result=isAlongword.test(s);
			System.out.println(result);
		}
}

