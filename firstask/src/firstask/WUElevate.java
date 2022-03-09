package firstask;

import package2.master;

public class WUElevate {
	public static void main(String[] args) {
		System.out.println("hello word");
		// calling another package method
		master s = new master();
		s.callMasterMethod();

		// calling variable test
		variable.variableMethod();

	}
}
