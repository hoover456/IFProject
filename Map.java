
public abstract class Map {
	
	//Map info, used for moving
	static String name;
	static String north, south, east, west;
	static String flt, oflt; //Flavor text and Other Flavor text
	static Item myItem;
	//DAT CONSTRUCTOR
	public Map(String Name, String North, String South, String East,
				String West, String FLT, String OFLT, Item MyItem)
	{
		name = Name;
		north = North;
		south = South;
		east = East;
		west = West;
		flt = FLT;
		oflt = OFLT;
		myItem = MyItem;
	}
	//Talk to whatever npc you have at that location
	public abstract void talk();
	//Prints a different message depending on whether or not 
	//there is an item
	public void look()
	{
		if((myItem != null))
			Sys.p(flt);
		else
			Sys.p(oflt);
	}
	
	//Adds the item to the players inventory
	//Then sets it to null
	public Item takeItem()
	{
		if(myItem != null)
		{
			Globals.take(myItem);
			myItem = null;
		}
		else
		{
			Sys.p("There's nothing here to take.");
		}
	}
	
	
	//This is the final resting place for our commands
	//Override for location specific commands
	//@Param An array of commands that has already passed through
	//the parser and the World parser
	//see READMEDAMMIT.txt
	public void pars(String[] commands)
	{
		Sys.p("I don't understand.");
	}
	
}
