public class Strings
{
   public static String uniqueLetters(String str)
   {
      String letter = "";
      String unique = "";
      
      for(int i = 0; i < str.length(); i++)
      {
        
    	  letter = str.substring(i, i+1);
    	  if(!str.substring(i+1, str.length()).contains(letter) && !str.substring(0, i).contains(letter))
    	  {
    		  unique = unique + letter;
    	  }
    	  
      }
      
      return unique;
      
   }
}