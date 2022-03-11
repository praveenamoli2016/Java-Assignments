
public class constructor {
	int a;
	String name;

	constructor() {
		a = 0;
		name = null;

	}

	void show() {
		System.out.print(a + " " + name);
	}

	public static void main(String[] args) {
		constructor ref = new constructor();// yahi hai constructor
		ref.show();

	}
}
