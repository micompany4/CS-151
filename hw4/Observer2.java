

/*
 * The second observer class that extends BarGrapher
 * Unlike the first Observer class I made, this one actual creates bars 
 * and changes their height according to their input values from the text field
 */
public class Observer2 extends BarGrapher
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

	//does the magic that connects the Text class with the BarGrapher class
	//gets which bar should be changed and gets the value to change it by
	public void update(int i, int j)
	{

		//finds out which bar graph will be changed and changes it with the assigned value
		if(i == 1)
		{
			//changes the height of the bar with the given value
			getJ1().setBounds(0, 0, 30, j);
		}
		else if(i == 2)
		{
			//changes the height of the bar with the given value
			getJ2().setBounds(40, 0, 30, j);
		}
		else if(i == 3)
		{
			//changes the height of the bar with the given value
			getJ3().setBounds(80, 0, 30, j);
		}
		else if(i == 4)
		{
			//changes the height of the bar with the given value
			getJ4().setBounds(120, 0, 30, j);
		}
		else
		{
			//changes the height of the bar with the given value
			getJ5().setBounds(160, 0, 30, j);
		}

	}



}
