package oops;

  class Encapsulation2 {
	
	private int value;//data hiding
	
	

	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}

 }
	public class Encapsulation {
	public static void main(String[] args) {
		
		Encapsulation2 e=new Encapsulation2();
		//e.value=100;
		e.setValue(100);
		System.out.println(e.getValue());
		
		

	}

}
