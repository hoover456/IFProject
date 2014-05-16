public class Main {
	public static void main(String[] args)
	{
		//whether it is a boy or not
		boolean isBoy;
		
		//Class initializations
		World.init(); 
		
		//Find out player info
		String name = Sys.scan("What is your name?");
		String gen = Sys.scan("Are you a boy or are you a girl?");
		switch(gen)
		{
		case "boy": case "male": case "man": case "dude":
			isBoy = true;
		default:
			isBoy = false;
		}
		
		//Create a player
		Globals.newPlayer(name, isBoy);
		
		//Runs the engine
		//First it displays the current location's look method
		//Then it scans for user input. That line is broken up into words.
		//The parser will parse the array of words
		//The system pauses before the next line can be entered. 
		boolean meGivingADamn = false;
		while(!meGivingADamn)
		{
			World.look();
			String command = Sys.scan();
			String[] strings = command.toLowerCase().trim().split(" ");
			Parser.go(strings);
			Sys.pause();
			//Sys.newScreen(); FIND A WAY TO CLEAR LINES
		}
	}
}
