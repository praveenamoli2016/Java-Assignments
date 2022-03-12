import java.util.ArrayList;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.replaceAll(i->i*10);
		System.out.println(list);
	}

}
