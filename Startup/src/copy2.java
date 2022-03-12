
class copy1 {
	int a; String b;
	copy1()
	{
		a=10; b="praveen";
		System.out.println(a+" "+b);
	}
	copy1(copy1 ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
	class copy2
	{
		public static void main(String[] args) {
			copy1 r=new copy1();
			copy1 r2=new copy1(r);
		}
	}
	



