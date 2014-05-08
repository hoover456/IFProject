import java.io.IOException;


public class Write {
	private String filePath;
	public void setFilePath(String newFilePath)
	{
		filePath = newFilePath;
	}
	public void write(String str)
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
	public void write(String str, boolean append)
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
	public void write(String str, String newFilePath)
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
	public void write(String str, String newFilePath, boolean append)
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
