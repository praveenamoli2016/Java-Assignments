@FunctionalInterface
interface Square 
{
	public int square(int num);//Functional interface
}

public class Lambdaexpression5 {
	 public static void main(String[] args){
			
			 Square r=(int num) -> {return(num*num);};
				System.out.println(r.square(5));
			 
	 }
}


