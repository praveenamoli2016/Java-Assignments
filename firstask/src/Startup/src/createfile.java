import java.io.*;
public class createfile {
	public static void main(String[] args)  {
		
		File f = new File("E:\\File\\abc1.txt");
		try
		  {
			if(f.createNewFile())
		    {
				System.out.println("file successfully create...!");
			} 
			
		    else
		    {
			  System.out.println("file already exist...!");
		    }
		  }
		 catch(IOException e) {
				System.out.println("exception handle...");
				
			}
	}
		

}
