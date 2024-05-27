                     /*FileWriter*/
package firstask.src.Exceptionshandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("C:\\Users\\stanr\\Desktop\\may -2024 java\\OM.txt");
			try
			{
				f.write("java program...");
			}
			finally
			{
				f.close();//
			}
			System.out.println("succesfully data wrote in file");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		
	}

}
