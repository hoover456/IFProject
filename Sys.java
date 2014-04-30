
import java.util.ArrayList;
import java.util.Scanner;
public class Sys {
	private static String str2 = "";
 	private static Scanner scan = new Scanner(System.in);
	public Sys() {

	}

	// takes an int for seconds and delays the system by that long
	@SuppressWarnings("static-access")
	public static void delay(double secs) {
		secs = secs * 1000;
		try {
			Thread.currentThread().sleep((int) secs);
		} catch (InterruptedException ie) {
		}
	}
	public static ArrayList<String> split(String str)
	{
		ArrayList<String> strings = new ArrayList<String>();
			for(int c = 0; c < str.length(); c++)
			{
				if(str.charAt(c) == ' ')
				{
					strings.add(str.substring(c));
					str = str.substring(c);
				}
		}
		return strings;
	}
	public static void sp(String input) {
		for (int c = 0; c < input.length(); c++) {
			if(input.charAt(c) != '\\')
			{
				System.out.print(input.charAt(c));
			}
			else
			{
				switch(input.charAt(c+1))
				{
						case 't':
							System.out.print("     ");
						break;
						case 'n':
							System.out.println();
							break;
						case '\\':
								System.out.print("\\");
								delay(.05);
								break;
						case '"':
								System.out.print("\"");
								delay(.05);
								break;
						default:
							break;
				}
				c++;
			}
			delay(.05);
		}
		System.out.println();
	}
	public static void supersp(String input) {
		for (int c = 0; c < input.length(); c++) {
			if(input.charAt(c) != '\\')
			{
				System.out.print(input.charAt(c));
			}
			else
			{
				switch(input.charAt(c))
				{
					case 't':
						System.out.print("     ");
						break;
					case 'n':
						System.out.println();
						break;
					case '\\':
						System.out.print("\\");
						delay(.15);
						break;
					case '"':
						System.out.print("\"");
						delay(.15);
						break;
					default:
						break;
				}
				c++;
			}
			delay(.15);
		}
		System.out.println();
	}
	public static String scan()
	{
		pn(">");
		String choice = scan.nextLine();
		return gen(choice);
	}

	public static String scan(String message)
	{
		p(message);
		pn(">");
		String choice = scan.nextLine();
		return gen(choice);
	}
	public static String scanSp(String message)
	{
		sp(message);
		pn(">");
		String choice = scan.nextLine();
		return gen(choice);
	}
	public static String gen(String genMe)
	{
		genMe = genMe.toLowerCase().trim();
		switch(genMe)
		{
		case "y": case "ok": case "yes": case "sure": case "true":
			return "y";
		case "n": case "no": case "never": case "false":
			return "n";
		case "take": case "t": 
			return "take";
		case "talk": case "speak": case "chat":
			return "talk";
			default: return genMe;
		}
	}
	public static void p(String str)
	{
		System.out.println(str);
	}
	public static void p()
	{
		System.out.println();
	}
	public static void pn(String str)
	{
		System.out.print(str);
	}
	public static void pause()
	{
		pn("[ENTER]");
		scan.nextLine();
	}
}
