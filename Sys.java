
import java.util.Scanner;
public class Sys {
	//private static String str2 = "";
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
	
	//Slow Prints a string
	// 20 chars a second
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
	
	//Prints a message REALY SLOWLY
	//7ish chars a second
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
	
	//Prints > and prompts a response
	//@return the response
	public static String scan()
	{
		pn(">");
		String choice = scan.nextLine();
		return choice;
	}
	//Prints a message before it attempst to scan
	//@return the response to the message
	public static String scan(String message)
	{
		p(message);
		pn(">");
		String choice = scan.nextLine();
		return choice;
	}
	//Same thing as ^^^ however it slow prints the message
	public static String scanSp(String message)
	{
		sp(message);
		pn(">");
		String choice = scan.nextLine();
		return choice;
	}
	
	//Sanitizes the inputs. It changes anything it can to as standard
	//string for ease of programing.
	public static String[] generalize(String[] words)
	{
		for(String s: words)
		{
			switch(s)
			{
			case "north":
				s = "n";
				break;
			case "south":
				s = "s";
				break;
			case "east":
				s = "e";
				break;
			case "west":
				s = "w";
				break;
			case "look": case "examine":
				s = "l";
				break;
			case "chat": case "speak": 
				s = "talk";
				break;
			case "steal":
				s = "take";
				break;
			case "ok": case "sure": case "true":
				s = "yes";
				break;
			case "never": case "false": 
				s = "no";
				break;
			}
		}
		return words;
	}
	
	//Returns true if the array contains the string
	//or a string contains the pattern
	public static boolean contains(String[] words, String pattern)
	{
		boolean hasIt = false;
		for(String s: words)
		{
			if(s.equals(pattern) || s.contains(pattern))
				hasIt = true;
		}
		return hasIt;
	}
	//Shortcut for System.out.println(Message)
	public static void p(String str)
	{
		System.out.println(str);
	}
	//Shortcut for System.out.println()
	//USed for skipping lines
	public static void p()
	{
		System.out.println();
	}
	//Shortcut for System.out.print(Message);
	//Stands for print no skip
	public static void pn(String str)
	{
		System.out.print(str);
	}
	//Displays a nice enter message and scans for a new line
	public static void pause()
	{
		pn("[ENTER]");
		scan.nextLine();
	}
}
