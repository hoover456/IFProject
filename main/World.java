package main;
import java.util.ArrayList;

import locations.AcoricoSquare;


public class World {
	static ArrayList<Map> maps = new ArrayList<Map>();//An array of all maps
	
	static Map currentMap;//Your current location
	
	//This runs at the beginning of the game
	//It sets up all of the maps that we will use in an array list
	public static void init()
	{
		Sys.p("Loading Maps");
		AcoricoSquare as = new AcoricoSquare();
		maps.add(as);
		currentMap = maps.get(0);
		Sys.p("Maps loaded");
	}
	//Attempt to go to a location specified
	//If you can't go there, it will tell you
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
			currentMap.uponAriving();
		}
	}
	
	//Parses through location based commands
	//ie looking and moving
	public static void parse(String[] actions)
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
					currentMap.goNorth();
					break;
				case "s":
					currentMap.goSouth();
					break;
				case "e":
					currentMap.goEast();
					break;
				case "w": 
					currentMap.goWest();
				default:
					currentMap.parse(actions);
				}
			}
		}

	}
	
	//Easier access for the look method
	public static void look()
	{
		currentMap.look();
	}
	
}
