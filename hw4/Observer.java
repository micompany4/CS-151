

/*
 * Observer class that implements the observer pattern
 * Grants the ability for the two classes to talk to each other
 * This one is no longer used because I created Observer2 that enables real bar graphs
 * I'm just gonna leave this here to show my progression and initial thought process
 * that ultimately led to Observer2
 */
public class Observer extends TextGrapher
{
	//variable to determine size of the bar graphs
	private int tall;

	
	public void setTall(int t)
	{
		tall = t;
	}
	
	public int getTall()
	{
		return tall;
	}
	
	//does the magic that connects the Text class with the TextGrapher class
	//gets which bar graph should be changed and gets the value to change it by
	public void update(int i, int j)
	{
		//creates the bars for the graph
		String s = "";
		for(int c = 0; c < j; c++)
		{
			s += "[#]";
		}
		
		//finds out which bar graph will be changed and changes it with the assigned value of bars
		//sets the text to the number of brackets
		if(i == 1)
		{
			getQ1().setText(s);
			
		}
		if(i == 2)
		{
			getQ2().setText(s);
			
		}
		if(i == 3)
		{
			getQ3().setText(s);
			
		}
		if(i == 4)
		{
			getQ4().setText(s);
			
		}
		if(i == 5)
		{
			getQ5().setText(s);
			
		}
		
	}
	
	
}
