/*
 * Class that manages the printing of the different types of arrays
 */
public class AltArray 
{
	private Object[] array;
	private int counter;
	
	public AltArray()
	{
		counter = 0;
		
	}
	
	public Object getArray()
	{
		return array;
	}
	
	public void setArray(Object[] o)
	{
		array = o;
	}
	
	/*
	 * Overrides toString() for objects
	 * returns a string that says what the object is and if that object has an overridden toString()
	 * adds that to the string as well
	 */
	public String toString()
	{
		return "Object type: " + array[counter].getClass().getSimpleName() + array[counter].toString();
		
	}
	
	public String getOtherClass()
	{
		
		return array.getClass().getComponentType().getName();
	}
	
	/*
	 * takes in multiple arrays and converts them to Object[] arrays
	 * then calls dumpArray() to print them
	 * Note: you can only pass one object[] at a time. 
	 */
	public void getType(Object[] obj, String[] str, char[] primC, boolean[] primB, byte[] primBy, short[] sh, int[] primInt, long[] primL, float[] primF,  double[] primD)
	{
		//if the array exist, print the elements inside out
		if(obj != null)
		{
			setArray(obj);
			dumpArray(obj);
		}
		if(str != null)
		{
			setArray(str);
			dumpArray(str);
		}
		
		//for the primitive type arrays, convert them to objects using their respected wrapper classes
		//and then print their elements out
		if(primC != null)
		{
			Character[] chara = new Character[primC.length];
			for(int i = 0; i < primC.length; i++)
			{
				chara[i] = primC[i];
			}
			dumpArray(chara);
		}
		if(primB != null)
		{
			Boolean[] bool = new Boolean[primB.length];
			for(int i = 0; i < primB.length; i++)
			{
				bool[i] = primB[i];
			}
			dumpArray(bool);
		}
		if(primBy != null)
		{
			Byte[] by = new Byte[primBy.length];
			for(int i = 0; i < primBy.length; i++)
			{
				by[i] = primBy[i];
			}
			dumpArray(by);
		}
		if(sh != null)
		{
			Short[] shorty = new Short[sh.length];
			for(int i = 0; i < sh.length; i++)
			{
				shorty[i] = sh[i];
			}
			dumpArray(shorty);
		}
		if(primInt != null)
		{
			Integer[] ente = new Integer[primInt.length];
			for(int i = 0; i < primInt.length; i++)
			{
				ente[i] = primInt[i];
			}
			dumpArray(ente);
		}
		if(primL != null)
		{
			Long[] lo = new Long[primL.length];
			for(int i = 0; i < primL.length; i++)
			{
				lo[i] = primL[i];
			}
			dumpArray(lo);
		}
		if(primF != null)
		{
			Float[] flo = new Float[primF.length];
			for(int i = 0; i < primF.length; i++)
			{
				flo[i] = primF[i];
			}
			dumpArray(flo);
		}
		if(primD != null)
		{
			Double[] dd = new Double[primD.length];
			for(int i = 0; i < primD.length; i++)
			{
				dd[i] = primD[i];
			}
			dumpArray(dd);
		}
	}
	
	/*
	 * prints the elements inside the array
	 * uses the overridden toString() for objects
	 */
	public void dumpArray(Object[] obj)
	{
		//prints for an array of objects
		if(obj.getClass().getComponentType().isInstance(new Object[obj.length]))
		{
			System.out.println(obj.getClass().getComponentType().getSimpleName());
			for(int i = 0; i < obj.length; i++)
			{
				System.out.println(this.toString());
				counter++;
			}
		}
		else //prints for the (formerly)array of primitives or String
		{
			System.out.println(obj.getClass().getComponentType().getSimpleName()); 
			for(int i = 0; i < obj.length; i++)
			{
				System.out.println(obj[i]);
				counter++;
			}
			
		}
	}
	
}
