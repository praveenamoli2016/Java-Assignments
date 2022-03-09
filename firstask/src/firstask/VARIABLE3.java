package firstask;

public class VARIABLE3 {
    int num=20;
    void m1()
    {
    	int num=30;
    	System.out.println("number:"+num);
    	System.out.println("number:"+this.num);
    }
    public static void main(String[] args) {
    	VARIABLE3 s=new VARIABLE3();
    	s.m1();
    }
}
