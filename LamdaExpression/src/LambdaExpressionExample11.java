
import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   
class Product6{  
    int id;  
    String name;  
    float price;  
    public Product6(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionExample11{  
    public static void main(String[] args) {  
        List<Product6> list=new ArrayList<Product6>();  
        list.add(new Product6(1,"Samsung A5",17000f));  
        list.add(new Product6(3,"Iphone 6S",65000f));  
        list.add(new Product6(2,"Sony Xperia",25000f));  
        list.add(new Product6(4,"Nokia Lumia",15000f));  
        list.add(new Product6(5,"Redmi4 ",26000f));  
        list.add(new Product6(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product6> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}  