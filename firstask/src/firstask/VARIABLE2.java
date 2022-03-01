package firstask;

public class VARIABLE2 {
	public String name="praveen"; //declaration of instance variable
			VARIABLE2() //declaration of instance variable
			{
		   int id=1234;
		   System.out.println("id of student:"+id);
			}
		public void mySchool() //declaration of user-defined method in instance area
		{
			String schoolName="SRJPS";//declaration of local variable
			System.out.println("name of school:"+schoolName);
		}
		//public void mySchool1()
		/*{
			System.out.println("name of school:"+schoolName);//not possible because local variable can not access outside the method,constructor or block
		}*/
		public static void main(String[] args) {
			//create the object of class VARIABLE2
			VARIABLE2 s=new VARIABLE2();
			s.mySchool();
		}
}
