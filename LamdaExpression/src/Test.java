import java.util.ArrayList;
import java.util.function.Predicate;


// Java program to demonstrate lambda expressions
//to implement a user defined functional interface.

//A sample functional interface (An interface with
//single abstract method
interface FuncInterface
{
 // An abstract function
 void abstractFun(int x);

 // A non-abstract (or default) function
 default void normalFun()
 {
    System.out.println("Hello");
 }
}

public class Test {
	public static void main(String[] args){
		/*Predicate<String>isAlongword=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length()>10;
			}
		};*/
		
		// lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
		Predicate<String>isAlongword= t->t.length()>10;
			String s="successfully";
			boolean result=isAlongword.test(s);
			System.out.println(result);
			
			ArrayList<Integer> arrL = new ArrayList<Integer>();
	        arrL.add(1);
	        arrL.add(2);
	        arrL.add(3);
	        arrL.add(4);

	        // Using lambda expression to print all elements
	        // of arrL
	        arrL.forEach(n -> System.out.println(n));

	        // Using lambda expression to print even elements
	        // of arrL
	        arrL.forEach(n -> {
	            if (n % 2 == 0)
	                System.out.println(n);
	        });
		}
}

