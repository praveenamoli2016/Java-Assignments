import java.io.FileWriter;
import java.io.IOException;

public class filewritter {
	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("C:\\Users\\Ram Janki Family\\Desktop\\praveen.txt");
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
