
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
   // numbers.forEach( (n) -> { System.out.println(n); } );
    //System.out.println(numbers);
    
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
}