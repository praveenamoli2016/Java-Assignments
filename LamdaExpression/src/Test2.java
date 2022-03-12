import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
		public static void main(String[] args){
		
			List<String> l=new ArrayList<>();
			l.add("praveen");
			l.add("rahul");
			l.add("nitin");
			l.add("neeraj");
			List<String> filtered=l.stream().filter(s->s.length()>6).collect(Collectors.<String>toList());
				System.out.println(filtered);
			}

	}

