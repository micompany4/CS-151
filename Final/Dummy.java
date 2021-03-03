
/*
 * A dummy class to represent an object for part 2 coding question chapter 7
 */
public class Dummy 
{
	private String name;
	private int num;
	
	//constructor that takes an int and a string
	public Dummy(int i, String s)
	{
		num = i;
		name = s;
	}
	
	//overrides toString() for the Dummy object
	public String toString()
	{
		return " Inside information: " + " number: " + num + ", name: " + name;
	}
	
	
}
