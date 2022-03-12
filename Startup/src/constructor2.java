
public class constructor2 {
	int a;
	String name;       //java me constructor default hota 

	/*constructor2() {
		a = 0;
		name = null;

	}*/

	void show() {
		System.out.print(a + " " + name);
	}

	public static void main(String[] args) {
		constructor ref = new constructor();// yahi hai constructor
		ref.show();

	}

}
