package firstask;

public class readandwrite {
	int number_of_ball;
	public static void main(String[] args) {
		readandwrite rr=new readandwrite();
		readandwrite rr2;//reassignment
		rr2 = rr; // dereferances
		rr.number_of_ball=10;  //write
		System.out.println(rr.number_of_ball);//read
		//System.out.println(rr2.number_of_ball);
	}
}
