package giraffe;

public class Observer extends TextGrapher
{
	private int tall, section;
	
	public Observer()
	{
		
	}
	
	
	public void setTall(int t)
	{
		tall = t;
	}
	
	public int getTall()
	{
		return tall;
	}
	
	public void setSection(int s)
	{
		section = s;
	}
	
	public int getSection()
	{
		return section;
	}
	
	public void update(int i, int j)
	{
		String s = "";
		for(int c = 0; c < j; c++)
		{
			s += "[#]";
		}
		
		
		
		if(i == 1)
		{
			getQ1().setText(s);
		}
		else if(i == 2)
		{
			getQ2().setText(s);
		}
		else if(i == 3)
		{
			getQ3().setText(s);
		}
		else if(i == 4)
		{
			getQ4().setText(s);
		}
		else
		{
			getQ5().setText(s);
		}
		
	}
	
	
}
