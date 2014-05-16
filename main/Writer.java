package main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Writer {
	private String filePath;
	private boolean append;
	public Writer(String myfilePath, boolean myappend)
	{
		filePath = myfilePath;
		append = myappend;
	}
	public Writer(String myfilePath)
	{
		filePath = myfilePath;
		append = false;
	}
	public void write(String text)throws IOException
	{
		FileWriter fw = new FileWriter(filePath, append);
		PrintWriter pw = new PrintWriter(fw);
		pw.printf("%s" + "%n", text);
		pw.close();
	}
}
