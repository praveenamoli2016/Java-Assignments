package firstask.src.Exceptionshandling;

import java.io.File;
public class FileInformation {

		public static void main(String[] args)  {
			
			File f = new File("C:\\Users\\stanr\\Desktop\\may -2024 java\\OM.txt");
			
				if(f.exists())
					
			    {
					System.out.println("file name:"+f.getName());
					System.out.println("file location:"+f.getAbsolutePath());
					System.out.println("file Writable :"+f.canWrite());
					System.out.println("file Readable:"+f.canRead());
					System.out.println("file Size:"+f.length());
					System.out.println("file removed:"+f.delete());
				} 
				
			    else
			    {
				  System.out.println("file does not exists...!");
			    }
		}
			

	}



