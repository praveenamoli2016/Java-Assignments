
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> Name=new Stack<>();//LIFO//yaha pe string likhane ki jarurat nhi hai
		Name.push("neeraj");//element ko stack memory me store karne ke liye special
		Name.push("suraj");//method hota hai push
		Name.push("sachin");//element insert use krne ke liye hm push karenge
			System.out.println(Name);//delete karne ke liye pop
			Name.pop();
			System.out.println(Name);
            
			
 

}
}
