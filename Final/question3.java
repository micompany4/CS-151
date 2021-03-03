import javax.swing.JFrame;

/*
 * Run to see question3 in action
 */
public class question3 
{
	
	
	public static void main(String args[])
	{
		
		//creates three AnimationTesters with different car speeds
		AnimationTester a1 = new AnimationTester(100);
		AnimationTester a2 = new AnimationTester(10);
		AnimationTester a3 = new AnimationTester(1);
		
		
		
		try
		{
			a1.getThread().sleep(1000);
			a2.getThread().sleep(1);
			a3.getThread().sleep(100);
			
		}
		catch(InterruptedException f)
		{
			System.out.println("interrupted");
		}
		
		
	}

}


