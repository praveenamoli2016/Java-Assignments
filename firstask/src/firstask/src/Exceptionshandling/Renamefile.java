package firstask.src.Exceptionshandling;

import java.io.File;
public class Renamefile {

		public static void main(String[] args)  {
			
			File f = new File("C:\\Users\\stanr\\Desktop\\may -2024 java\\OM.txt");
			File f2 = new File("C:\\Users\\stanr\\Desktop\\may -2024 java\\praveen.txt");
				if(f.exists())
					
			    {
					System.out.println("file name:"+f.renameTo(f2));

				} 
				
			    else
			    {
				  System.out.println("file does not exists...!");
			    }
		}
			

	}



