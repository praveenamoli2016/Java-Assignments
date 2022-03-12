import java.io.File;
import java.io.IOException;
public class createfilejava {
	public static void main(String[] args) throws IOException {//abhi exception ko main method ka caller jvm handle karega
		
		File f = new File("E:\\File\\abc1.txt");
		
		  
			if(f.createNewFile())
		    {
				System.out.println("file successfully create...!");
			} 
			
		    else
		    {
			  System.out.println("file already exist...!");
		    }
		  
				
			}
	}
		




