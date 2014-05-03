
public class Test {
	public static void main(String[] args)
	{
		String test  = " TESTING TESTING ONE TWO THREE";
		test = test.trim().toLowerCase();
		String[] strings = test.split(" ");
		for(String s: strings)
		{
			Sys.p(s);
		}
	}
}
