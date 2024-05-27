package firstask.src.Exceptionshandling;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) {
		
		try {
			FileReader r = new FileReader("C:\\Users\\stanr\\Desktop\\may -2024 java\\OM.txt");
		    try {
			int i;
			while ((i = r.read()) != -1) {
				System.out.print((char) i);
			}
		    }
		finally {
			r.close();
			//System.out.println("file closed");//
		}}
		catch (IOException e) {
			System.out.println("exception handled...");
		}

	}

}
