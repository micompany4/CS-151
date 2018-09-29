package frames;

import java.awt.*;
import javax.swing.*;


/*
 * Creates a frame for the user to test complete with buttons and a circle 
 */
public class ColorCircleTester 
{
	public static void main(String[] args)
	{
		//creates the three key elements for the frame
		JFrame window = new JFrame();
		ColorCircle circle = new ColorCircle(115, Color.red);
		JLabel stamp = new JLabel(circle);

		//creates the buttons with appropriate labels on them
		JButton redButton = new JButton("Red");
		JButton greenButton = new JButton("Green");
		JButton blueButton = new JButton("Blue");

		//sets the layout style to flow, i.e. elements are organized single file from left to right
		window.setLayout(new FlowLayout());

		//adds the necessary elements to the frame
		window.add(stamp);
		window.add(redButton);
		window.add(greenButton);
		window.add(blueButton);

		//changes the color of the circle upon pressing the appropriate button
		//button sets a new colored circle and draws over the old one
		//ensures that paintIcon is called to repaint the new colored circle
		redButton.addActionListener(event -> circle.paintIcon(stamp, stamp.getGraphics(), 0, 0));
		redButton.addActionListener(event -> circle.setColor(Color.red));
		redButton.addActionListener(event -> stamp.repaint());
		blueButton.addActionListener(event -> circle.paintIcon(stamp, stamp.getGraphics(), 0, 0));
		blueButton.addActionListener(event -> circle.setColor(Color.blue));
		blueButton.addActionListener(event -> stamp.repaint());
		greenButton.addActionListener(event -> circle.paintIcon(stamp, stamp.getGraphics(), 0, 0));
		greenButton.addActionListener(event -> circle.setColor(Color.green));
		greenButton.addActionListener(event -> stamp.repaint());

		
		

		//controls how the window will close, be seen and its size
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 200);
		window.setVisible(true);
	}
}
