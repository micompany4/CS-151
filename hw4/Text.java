package giraffe;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Text extends Observer 
{
	
	
	public Text()
	{
		JFrame text = new JFrame("Data Entry");
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		JTextField input5 = new JTextField(10);
		
		
		text.setLayout(new FlowLayout());
		
		
		text.add(new JLabel("input1"));
		text.add(input1);
		text.add(new JLabel("input2"));
		text.add(input2);
		text.add(new JLabel("input3"));
		text.add(input3);
		text.add(new JLabel("input4"));
		text.add(input4);
		text.add(new JLabel("input5"));
		text.add(input5);
		
		
		input1.addActionListener(event -> update(1, getTall()));
		//input1.addActionListener(event -> System.out.println(getTall()));
		input1.addActionListener(event -> setTall(Integer.parseInt(input1.getText())));
		//input1.addActionListener(event -> System.out.println(getSection()));
		input1.addActionListener(event -> setSection(1));
		
		input2.addActionListener(event -> update(2, getTall()));
		input2.addActionListener(event -> setSection(2));
		input2.addActionListener(event -> setTall(Integer.parseInt(input2.getText())));
		
		input3.addActionListener(event -> update(3, getTall()));
		input3.addActionListener(event -> setSection(3));
		input3.addActionListener(event -> setTall(Integer.parseInt(input3.getText())));
		
		input4.addActionListener(event -> update(4, getTall()));
		input4.addActionListener(event -> setSection(4));
		input4.addActionListener(event -> setTall(Integer.parseInt(input4.getText())));
		
		
		input5.addActionListener(event -> update(5, getTall()));
		input5.addActionListener(event -> setSection(5));
		input5.addActionListener(event -> setTall(Integer.parseInt(input5.getText())));
		
		
		text.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text.setSize(50, 400);
		text.setVisible(true);
	}
	

}
