package frames;

import javax.swing.*;
import java.awt.*;


/*
 * Class that allows you to zoom in or out of an icon
 * In this case the icon is a car
 */
public class Zoom 
{
	public static void main(String[] args)
	{
		//creates the necessary elements for this frame
		CarIcon car = new CarIcon(175);
		JFrame binoculars = new JFrame();
		JLabel model = new JLabel(car);

		//creates the buttons for this frame
		JButton zoomIn = new JButton("Zoom in");
		JButton zoomOut = new JButton("Zoom out");

		//sets the style for these buttons
		zoomIn.setFont(new Font("Calibri", Font.PLAIN, 50));
		zoomOut.setFont(new Font("Calibri", Font.PLAIN, 50));

		//add the elements to the frame
		binoculars.add(model);
		binoculars.add(zoomIn);
		binoculars.add(zoomOut);

		//set layout type
		binoculars.setLayout(new GridLayout());

		//paints an enlarged or smaller version of the icon when the appropriate button is pressed
		//repaint() makes sure it's painted in the correct spot
		zoomIn.addActionListener(event -> car.paintIcon(model, model.getGraphics(), 0, 0));
		zoomIn.addActionListener(event -> car.changeWidth(25));
		zoomIn.addActionListener(event -> model.repaint());
		zoomOut.addActionListener(event -> car.paintIcon(model, model.getGraphics(), 0, 0));
		zoomOut.addActionListener(event -> car.changeWidth(-25));
		zoomOut.addActionListener(event -> model.repaint());

		//manages the size, visibility and closure of the frame
		binoculars.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		binoculars.setSize(1000, 350);
		binoculars.setVisible(true);
	}
}
