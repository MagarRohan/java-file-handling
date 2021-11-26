import java.util.*;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadUsingInputStream
{

	public static void main(String args[])
	{
		String path = null;
		FileInputStream fin = null;
		System.out.println("Hello World");
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter name of file\n");
		path = sobj.nextLine();

		try
		{
			fin = new FileInputStream(path);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		int i =0;
		try
		{
			while((i = fin.read())!= -1)
						{
							System.out.print((char)i);
						}
						fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
			
		System.out.println(path);
		}
	}


}