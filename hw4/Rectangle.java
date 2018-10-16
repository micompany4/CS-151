

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

/*
 * Rectangle class that implements the icon interface
 * Class that was suppose to be used to create rectangles to be drawn on the frame
 */
public class Rectangle implements Icon
{
	//variables to determine where on the x-axis the bars will be, 
	//how tall the rectangles would be and a fixed width
	private int height;
	public static int width = 25;
	
	//constructs a rectangle with the specified height and spot on the x-axis
	public Rectangle(int height)
	{
		this.height = height;
		
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	
	@Override
	public int getIconHeight() 
	{
		return height;
	}

	@Override
	public int getIconWidth() 
	{
		return width;
	}

	//draws the rectangle at the specified location and dimensions
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) 
	{
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D.Double rect = new Rectangle2D.Double(0, 0, width, height);
		g2.setColor(Color.BLUE);
		g2.fill(rect);

	}

}

