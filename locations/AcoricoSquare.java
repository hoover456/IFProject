package locations;
import main.Item;
import main.Map;
import main.Sys;


public class AcoricoSquare extends Map {
	//THIS IS ONLY AN EXAMPLE
	//#MoreCommentsComments
	
	static String name = "Acorico Square";
	static String north = "Oak's Lab";
	static String south = "Acorico Gates";
	static String east = "Market";
	static String west = "Docks";
	//This is one of your possible look lines, usualy if myItem is not null
	static String flt = "You are in Acorico's Square.\n"
			+ "North: Oak's Lab\n"
			+ "South: Acorico Gates\n"
			+ "East: Market\n"
			+ "West: Docks\n"
			+ "There is a sword on the ground. Oak stands in the square";
	//Other look line
	static String oflt = "You are in Acorico's Square.\n"
			+ "North: Oak's Lab\n"
			+ "South: Acorico Gates\n"
			+ "East: Market\n"
			+ "West: Docks\n"
			+ "Oak stands in the square";
	
	//Variable representing a lever
	boolean lever = false;
	
	//Constructor, just supers the important stuff
	public AcoricoSquare()
	{
		super(name, north, south, east, west, flt, oflt, Item.sword);
	}
	
	//Just read it
	public void talk()
	{
		if(myItem != null)
		{
			Sys.p("Hello Andrew. You should take the sword");
		}
		else
		{
			Sys.p("Good job Andrew. You took the sword");
		}
	}
	//A sample location based parser
	public void pars(String[] commands)
	{
		switch(commands[0])
		{
		case "toggle": case "flip": case "hit":
			lever = !lever;
		}
	}
}
