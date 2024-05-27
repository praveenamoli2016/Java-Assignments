package firstask.src.Exceptionshandling;
import java.io.File;
import java.io.IOException;
public class Createfile {

		public static void main(String[] args)  {
			
			File f = new File("C:\\Users\\stanr\\Desktop\\may -2024 java\\OM.txt");
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
					System.out.println("exception handled...!");
					
				}
		}
			

	}



