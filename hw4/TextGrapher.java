

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Creates the frame for the graphs
 * Graphs are not rectangles, they are make shift boxes and get added to
 * the bar labels depending on the inputed value
 */
public class TextGrapher
{
	private JFrame graph = new JFrame("Bracket Graphs");
	
	//creates the labels to denote which "bar graph" is for which input
	private JLabel bar1 = new JLabel("Bar1: ");
	private JLabel bar2 = new JLabel("Bar2: ");
	private JLabel bar3 = new JLabel("Bar3: ");
	private JLabel bar4 = new JLabel("Bar4: ");
	private JLabel bar5 = new JLabel("Bar5: ");
	
	//the labels to hold the "bars" 
	private JLabel q1 = new JLabel("");
	private JLabel q2 = new JLabel("");
	private JLabel q3 = new JLabel("");
	private JLabel q4 = new JLabel("");
	private JLabel q5 = new JLabel("");
	
	//constructs the frame with its components
	public TextGrapher()
	{
		
		//sets up the frame with the appropriate added labels and bars
		//grid layout because I want the bar labels on the same line as the graph labels
		graph.setLayout(new GridLayout(5,2));
		
		graph.add(bar1);
		graph.add(q1);
		
		graph.add(bar2);
		graph.add(q2);
		
		graph.add(bar3);
		graph.add(q3);
		
		graph.add(bar4);
		graph.add(q4);
		
		graph.add(bar5);
		graph.add(q5);
		
		
		
		
		graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graph.setSize(300, 400);
		graph.setVisible(true);
	}
	
	//getters for the 5 different labels
	public JLabel getQ1()
	{
		return q1;
	}
	
	public JLabel getQ2()
	{
		return q2;
	}
	
	public JLabel getQ3()
	{
		return q3;
	}
	
	public JLabel getQ4()
	{
		return q4;
	}
	
	public JLabel getQ5()
	{
		return q5;
	}
	
}
