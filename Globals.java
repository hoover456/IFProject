public class Globals
{
	//This is your player. Treat him nicely
	static Player play;
	
	//Constructs a player
	public static void newPlayer(String name, boolean gender)
	{
		play = new Player(name, gender);
	}
	
	public static void takeItem(Item i)
	{
		if(i != null)
			play.addItem(i);
		else
			Sys.p("There's nothing here to take");
	}

	public static void displayInventory() {
		// TODO Auto-generated method stub
		
	}
}