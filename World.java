import java.util.ArrayList;


public class World {
	static ArrayList<Map> maps = new ArrayList<Map>();//An array of all maps
	
	static Map currentMap = maps.get(0);//Your current location
	
	//This runs at the begining of the game
	//It sets up all of the maps that we will use in an array list
	public void init()
	{
		Sys.p("Loading Maps");
		AcoricoSquare as = new AcoricoSquare();
		maps.add(as);
		Sys.p("Maps loaded");
	}
	//Attempst to go to a location specified
	//If you cant go there, it will tell you
	//If you want we could use it to TP
	public static void go(String goTo)
	{
		if(goTo == null)
		{
			Sys.p("You cant go over there");
		}
		else
		{
			for(Map m: maps)
			{
				if(m.name.equals(goTo))
				{
					currentMap = m;
				}
			}
		}
	}
	
	//Parses through location based commands
	//ie looking and moving
	public void parse(String[] actions)
	{
		for(String s: actions)
		{
			if(s != null)
			{
				switch(s)
				{
				case "l":
					currentMap.look();
					break;
				case "take":
					currentMap.takeItem();
					break;
				case "n":
					go(currentMap.north);
					break;
				case "s":
					go(currentMap.south);
					break;
				case "e":
					go(currentMap.east);
					break;
				case "w":
					go(currentMap.west);
					break;
				default:
					currentMap.pars(actions);
				}
			}
		}

	}
	
}
