package frames;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/*
 * Class that creates an object colored circle
 * implements Icon so that the circles can be painted
 */
public class ColorCircle implements Icon
{
	private int dimension;
	private Color color;

	//constructs the colored circle to be painted
	public ColorCircle(int d, Color c)
	{
		dimension = d;
		color = c;
	}

	//sets the color for the circle 
	public void setColor(Color newColor)
	{
		color = newColor;
	}

	@Override
	public int getIconHeight() 
	{
		return dimension;
	}

	@Override
	public int getIconWidth() 
	{
		return dimension;
	}

	//paints an ellipse with the desired color 
	//color is declared in the constructor and can be changed through the setColor() method
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) 
	{
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, dimension, dimension);
		g2.setColor(color);
		g2.fill(circle);

	}
}
