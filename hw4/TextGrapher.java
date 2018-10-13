package giraffe;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextGrapher
{
	private JFrame graph = new JFrame();
	
	private JLabel bar1 = new JLabel("Bar1: ");
	private JLabel bar2 = new JLabel("Bar2: ");
	private JLabel bar3 = new JLabel("Bar3: ");
	private JLabel bar4 = new JLabel("Bar4: ");
	private JLabel bar5 = new JLabel("Bar5: ");
	
	private JLabel q1 = new JLabel("0");
	private JLabel q2 = new JLabel("0");
	private JLabel q3 = new JLabel("0");
	private JLabel q4 = new JLabel("0");
	private JLabel q5 = new JLabel("0");
	
	
	public TextGrapher()
	{
		//JFrame graph = new JFrame("Star Graph");
		
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
