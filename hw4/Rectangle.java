package giraffe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Rectangle implements Icon
{
	private int height;
	public static int width = 20;
	private int xSpot;
	
	public Rectangle(int height)
	{
		this.height = height;
		//this.xSpot = xSpot;
	}
	
	public void setHeight(int n)
	{
		height = n;
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

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) 
	{
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D.Double rect = new Rectangle2D.Double(xSpot, 0, width, height);
		g2.setColor(Color.BLUE);
		g2.fill(rect);

	}

}

