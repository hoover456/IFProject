import java.io.IOException;


public class Write {
	private static String filePath;
	public static void setFilePath(String newFilePath)
	{
		filePath = newFilePath;
	}
	public static void write(String str)
	{
		Writer writer = new Writer(filePath);
		try 
		{
			writer.write(str);
		}
		catch (IOException e)
		{
			System.out.println("Writer has failed");
		}
	}
	public static void write(String str, boolean append)
	{
		Writer writer = new Writer(filePath);
		try 
		{
			writer.write(str);
		}
		catch (IOException e)
		{
			System.out.println("Writer has failed");
		}
	}
	public static void write(String str, String newFilePath)
	{
		setFilePath(newFilePath);
		Writer writer = new Writer(filePath);
		try 
		{
			writer.write(str);
		}
		catch (IOException e)
		{
			System.out.println("Writer has failed");
		}
	}
	public static void write(String str, String newFilePath, boolean append)
	{
		setFilePath(newFilePath);
		Writer writer = new Writer(filePath, append);
		try 
		{
			writer.write(str);
		}
		catch (IOException e)
		{
			System.out.println("Writer has failed");
		}
	}
}
