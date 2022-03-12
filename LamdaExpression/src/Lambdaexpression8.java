import java.util.ArrayList;

public class Lambdaexpression8 {
	public static void main(String[] args){
		ArrayList ar=new ArrayList();
		ar.add(5);
		ar.add(10);
		ar.add(15);
		ar.add(20);
		/*for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}*/
		//for(Object b:ar)
		
			//System.out.println(b);
		
		
		ar.forEach((x)->System.out.println(x));
	

}
}
