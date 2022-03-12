        /* void draw()
	{
		System.out.println("can not say shape type");
	}  */
//agar ye method nhi rahega to ye compilation error dega


                     /*method overriding*/
class sachin2                                         
{
	void draw()
	{
		System.out.println("can not say shape type");
	}
}
class square2 extends sachin2
{

	void draw2() 
	{
		System.out.println("square shape");	// vah jan jayega ki yah draw method overhiden method hai kyki hmne eske uper ye line likh rakha hai
	}
}
  public class overriding2 {
	 public static void main(String[] args) {
		 sachin2 r=new square2(); //agar yaha pe hamara square ka hi ref variable hota to hame sirf ek hi error dega
		   r.draw();      // square2 r=new square2();

}
}




