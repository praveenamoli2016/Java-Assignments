/*method overloading*/
package Workingwithinheritance;

class amoli // without inheritance
{
	int a, b, c;

	//void add()
	// yaha int add()likh sakte hai
	int add()
	{

		a = 10;
		b = 20;
		c = a + b;
		//System.out.println(c);
		return c;
	}

	void add(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);
	}

	void add(int x, double y) {
		double c;
		c = x + y;
		System.out.println(c);
	}
}

public class Compiletimepolymorphism {
	public static void main(String[] args) {
		amoli r = new amoli();
		//r.add();
		r.add(100, 200);
		r.add(50, 40.5);
		int add=r.add();
		System.out.println(add);
	}

}
