public class Globals
{
	//This is your player. Treat him nicely
	Player play;
	
	//Constructs a player
	public void newPlayer(String name, boolean gender)
	{
		play = new Player(name, gender);
	}
	
	public void takeItem(Item i)
	{
		if(i != null)
			play.addItem(i);
		else
			Sys.p("There's nothing here to take");
	}
}