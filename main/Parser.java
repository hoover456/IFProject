package main;

public class Parser {
	public static void go(String[] words)
	{
		switch(words[0])
		{
		case "menu": 
			menu();
			break;
		case "save":
			save();
			break;
		case "inv": case "inventory": case "open": case "show":
			Globals.displayInventory();
			break;
		case "exit":
			if(Sys.scan("Realy Exit?").equals("yes"))
				System.exit(0);
		default:
			World.parse(words);
			break;
		}
	}
	private static void save() {
		// TODO Auto-generated method stub
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		
	}
}
