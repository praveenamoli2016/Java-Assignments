import java.util.function.Function;
import java.util.function.Supplier;

public class Test5 {

	public static void main(String[] args) {
		int n=5;
		display(()->n+10);
		display(()->n*100);
	}
     static void display(Supplier<Integer>arg) {
    	 System.out.println(arg.get());
     }
}

