
public abstract class Item {
	//Ignore for now
	public static Item sword;
	//Basic information
	protected String name;
	protected boolean stackable;
	protected int value;
	//Constructor
	public Item(String myName, boolean myStackable, int myValue)
	{
		name = myName;
		stackable = myStackable;
		value = myValue;
	}
	//Each type of object can have a different type of use
	//i.e. using a key. if not, leave blank
	public abstract void use();
	
	public String toString()
	{
		return name;
	}
}
