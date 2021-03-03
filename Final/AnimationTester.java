import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
 */
public class AnimationTester implements Runnable
{
	private Thread thread;// = new Thread(this);
	private int d;
	
	/*
	 * Constructor initialize the frames as threads.
	 * sets the delay for the timer later
	 */
	public AnimationTester(int d)
	{
		
		thread = new Thread(this);
		this.d = d;
		thread.start();
	}



	public Thread getThread()
	{
		return thread;
	}
	
	//runs the thread
	@Override
	public void run() 
	{
		
			JFrame frame = new JFrame();

		final MoveableShape shape
		= new CarShape(0, 0, CAR_WIDTH);

		ShapeIcon icon = new ShapeIcon(shape,
				ICON_WIDTH, ICON_HEIGHT);

		final JLabel label = new JLabel(icon);
		frame.setLayout(new FlowLayout());
		frame.add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		final int DELAY = d; //changes the speed of the car
		// Milliseconds between timer ticks
		try
		{
			
			Timer t = new Timer(DELAY, event ->
			{
					shape.move();
					label.repaint();
					
					if(shape.getX() >=ICON_WIDTH)
					{
						shape.reset();
						
					}
					
			});
			
			thread.sleep(100);
			t.start();
		}
		catch(InterruptedException f)
		{
			System.out.println("interruption");
		}
		
		
	}
	
	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
