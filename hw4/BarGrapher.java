package giraffe;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


/* 
 * Creates a frame to contain the bar graphs
 * Manages the visual representations of the bars in the graph
 */
public class BarGrapher 
{
	//creates the frame and the necessary components for the graph
	JFrame bar = new JFrame("Bar Graphs");
	private Rectangle r1 = new Rectangle(100);
	private Rectangle r2 = new Rectangle(100);
	private Rectangle r3 = new Rectangle(100);
	private Rectangle r4 = new Rectangle(100);
	private Rectangle r5 = new Rectangle(100);

	private JLabel j1 = new JLabel(r1);
	private JLabel j2 = new JLabel(r2);
	private JLabel j3 = new JLabel(r3);
	private JLabel j4 = new JLabel(r4);
	private JLabel j5 = new JLabel(r5);


	//constructs the frame to contain the bar graphs
	public BarGrapher()
	{
		//sets the layout and adds the JLabels to the frame
		bar.setLayout(new FlowLayout());

		bar.add(j1);
		bar.add(j2);
		bar.add(j3);
		bar.add(j4);
		bar.add(j5);


		bar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bar.setSize(350, 200);
		
		bar.setVisible(true);
	}

	//getters for the JLabels
	public JLabel getJ1()
	{
		return j1;
	}

	public JLabel getJ2()
	{
		return j2;
	}

	public JLabel getJ3()
	{
		return j3;
	}

	public JLabel getJ4()
	{
		return j4;
	}

	public JLabel getJ5()
	{
		return j5;
	}

}
