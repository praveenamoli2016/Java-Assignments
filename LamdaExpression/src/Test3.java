import java.util.function.Consumer;

class Product{
	private double price=0.0;
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void printPrice(double price)
	{
		System.out.println(price);
	}
}

public class Test3 {
	public static void main(String[] args){
		Consumer<Product>updatePrice=p-> p.setPrice(5.8);
		Product p=new Product();
		updatePrice.accept(p);
		p.printPrice(10.5);
		
		
	}

}
