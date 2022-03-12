import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test7 {
	public static void main(String[] args) {
		UnaryOperator<Integer>unary=v->v*10;
		Function<Integer,Integer>function=v->v*10;
    	 System.out.println(unary.apply(10));
    	 System.out.println(function.apply(10));
     }
}


