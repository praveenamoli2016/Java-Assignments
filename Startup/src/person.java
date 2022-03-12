
public class person {
	int age=21;
	int weight=56;
	String colour="light";
	void eat()
	{
		System.out.print("eating");
	}
	void sleep()
	{
		System.out.print("sleep");
	}
	public static void main(String[] args) {
		person p=new person();
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.colour);
		p.eat();   p.eat(); // for behavior
		
	
	}


}
