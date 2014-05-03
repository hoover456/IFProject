import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		//whether it is a boy or not
		boolean isBoy;
		
		//Class initiliazations
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
		//It starts by scanning for a line. That line is broken up into words.
		//The parser will parse the array of words
		//The system pauses before the next line can be entered. 
		boolean meGivingADamn = false;
		while(!meGivingADamn)
		{
			String command = Sys.scan();
			String[] strings = command.toLowerCase().trim().split(" ");
			//Parser.pars(strings)
			Sys.pause();
			//Sys.newScreen(); FIND A WAY TO CLEAR LINES
		}
		scan.close();
	}
}
