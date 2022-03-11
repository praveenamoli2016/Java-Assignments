import java.io.FileReader;
import java.io.IOException;

public class filereader {
	public static void main(String[] args) {
		try
		{
			FileReader r=new FileReader("C:\\Users\\Ram Janki Family\\Desktop\\praveen.txt");
			try
			{
				int i;
				while((i=r.read())!=-1)
				{
					System.out.println((char)i);
				}
			}
			finally
			{
				r.close();
				System.out.println("file closed");//
			}
			System.out.println("succesfully data wrote in file");
		}
		catch(IOException e)
		{
			System.out.println("exception handle");
		}
		
	}

}


