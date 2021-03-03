import java.io.*; 
import java.util.List; 
import java.util.ArrayList;


/*
 * run to see question1 in action
 */
public class question1
{

	public question1()
	{
		
	}
	
	
	public static void main(String args[])
	{
		Object[] obj1 = { new Dummy(1, "A"), new Dummy(2, "B"), new Dummy(3, "C")};		//array of dummy objects
		String[] obj2 = {"I", "love", "this", "final"};		//array of strings
		char[] obj3 = {'h', 'e', 'l', 'l', 'o'};		//array of chars
		boolean[] obj4 = {true, true, false, true, false};
		int[] obj5 = {0, 1, 2, 3, 4, 5};	//array of ints
		double[] obj6 = {24.5, 36.7, 45.0, 99.9, 17.38, 4.0};	//array of doubles
		//feel free to make arrays :)
		
		
		AltArray a = new AltArray();
		a.getType(obj1, obj2, obj3, obj4, null, null, obj5, null, null, obj6);

	}


}
