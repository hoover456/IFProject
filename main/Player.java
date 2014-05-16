package main;
import java.util.ArrayList;
public class Player
{
	String name;
	boolean isMale;
	ArrayList<Item> inv = new ArrayList<Item>();
	
	public Player(String myName, boolean gender)
	{
		name = myName;
		isMale = gender;
	}
	
	//Adds an item to the inventory
	//When i get around to it it will add stackable items as well
	public void addItem(Item i)
	{
		inv.add(i);
	}
	//Same thing but removes them instead
	public void removeItem(Item i)
	{
		inv.remove(i);
	}
}