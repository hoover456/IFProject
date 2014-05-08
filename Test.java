
public class Test {
	public static void main(String[] args)
	{
		Write w = new Write();
		w.setFilePath("I:\\Wyvern2\\IFProject\\src\\data.txt");
		w.write("Testing",true);
		w.write("Testing",true);
		w.write("456",true);
		System.out.println("YAY IT WORKED");
	}
}
