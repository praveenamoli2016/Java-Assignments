package firstask;
     /*static variable*/
public class VARIABLE4 {
           static int a=50; //declaration of static variable
        void m1()
        {
        	int a=40;
        	System.out.println("a:"+a);
        	System.out.println("a:"+VARIABLE4.a);//accessing static variable using class name
        }      //within instance method
        public static void main(String[] args) {
        	//System.out.println("a:"+a);
        	VARIABLE4 s=new VARIABLE4();
        	s.m1();
        }
}
