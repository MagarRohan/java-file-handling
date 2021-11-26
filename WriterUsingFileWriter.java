import java.util.*;
import java.io.FileWriter;  
import java.io.FileNotFoundException;
import java.io.IOException;

class Writer
{

	public static void main(String args[])
	{
		FileWriter  fos = null;
		Scanner sobj = new Scanner(System.in);
		String path = null;
		System.out.println("Enter the file name to write in");
		path = sobj.nextLine();

		try
		{
			fos = new FileWriter(path);

					fos.write("Hello");
					
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		try
		{
			fos.write("Hello");
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
					
		

	}

}