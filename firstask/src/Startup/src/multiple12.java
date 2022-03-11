                        /*Hierarchical inheritance*/
class arav54
{
	void input()
	{
		System.out.println("enter your name:");
	}
}
 class arav55 extends arav54
 {
	 void show()
		{
			System.out.println("my name is praveen:");
		} 
 }
 class arav56 extends arav54
 {
	 void disp() // dono method same esliye nhi kiya kyoki overriding ho jayega
		{
			System.out.println("my name is neeraj:");
		} 
 }
public class multiple12 {
	 public static void main(String[] args) {
		 arav55 r=new arav55();
		 arav56 r2=new arav56();
		 r.input(); r.show();
		 r2.input(); r2.disp();
		 
	 }
    	 

}
