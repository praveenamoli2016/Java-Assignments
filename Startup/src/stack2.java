import java.util.ArrayDeque;

public class stack2 {
	public static void main(String[] args) {
		ArrayDeque<String> Name=new ArrayDeque<>();//FIFO
		Name.push("neeraj");
		Name.push("suraj");
		Name.push("sachin");
			System.out.println(Name);
			Name.pop();
			System.out.println(Name);
	}
}

