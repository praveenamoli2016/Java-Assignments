                  /*method overloading*/
class amoli2 //without inheritance
{
	int a,b,c;
	int add()//yaha int add()likh sakte hai
	{
		
		 a=10;b=20;
		 c=a+b;
		 return c;
	}
	void add(int x,int y)
	{
		 int c;
		 c=x+y;
		 System.out.println(c);
	}
	void add(int x,double y)
	{
		 double c;
		 c=x+y;
		 System.out.println(c);
	}
}

public class overloading2 {
	 public static void main(String[] args) {
		 amoli2 r=new amoli2();
		 int add=r.add();  r.add(100,200);  r.add(50,40.5);
		 System.out.println(add);
	 }

}
