@FunctionalInterface
interface Add 
{
	void add(int x,int y);//Functional interface
}

/*class U implements Add
{
	@Override
	public void add(int x,int y)
	{
		System.out.println("Sum:"+(x+y));
	}
}*/
public class Lambdaexpression4  {
	 public static void main(String[] args){
			//U r=new U();
			 Add r=(x,y) -> System.out.println("Sum:"+(x+y));
				r.add(5,6);
}
}

