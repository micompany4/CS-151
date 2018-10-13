package giraffe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BarGrapher extends Observer
{
	JFrame f= new JFrame();
	
	public BarGrapher()
	{
		JFrame f = new JFrame();
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 500);
		f.setVisible(true);
	}
	
	public void update() 
	{
		System.out.println("test");
		
	}

	public void draw()
	{
		Rectangle r = new Rectangle(50);
		JLabel p = new JLabel(r);
		f.add(p);
		//r.paintIcon(p, p.getGraphics(), 0, 0);
		//p.repaint();
		
	}
	
}
