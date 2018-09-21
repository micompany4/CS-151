import java.util.ArrayList;

/**
   A system of voice mail boxes.
*/
public class MailSystem
{
   /**
      Constructs a mail system with a given number of mailboxes
      @param mailboxCount the number of mailboxes
   */
   public MailSystem(int mailboxCount)
   {
      mailboxes = new ArrayList<>();

      // Initialize mail boxes.

      for (int i = 0; i < mailboxCount; i++)
      {
         String passcode = "" + (i + 1);
         String greeting = "You have reached mailbox " + (i + 1)
               + ". \nPlease leave a message now.";
         mailboxes.add(new Mailbox(passcode, greeting));
      }
   }

   /**
      Locate a mailbox.
      @param ext the extension number
      @return the mailbox or null if not found
   */
   public Mailbox findMailbox(String ext)
   {
      try //reads the mailbox number entered and returns that mailbox to be used
      {
    	  b = false;
    	  int i = Integer.parseInt(ext);
    	  if (1 <= i && i <= mailboxes.size())
          {
        	  return  mailboxes.get(i - 1);
          }
      }
      catch(NumberFormatException n) //catches the NUmberFormatException and sets b to true
      {
    	  b = true; //signals that an invalid mailbox number has been entered
    	  return null;
    	  
      }
	return null;
      
   }

   /*
    * returns a boolean regarding the mailbox number
    */
   public boolean set()
   {
	   return b;
   }
   
   private boolean b; //boolean expression to determine if a valid mailbox number was entered
   private ArrayList<Mailbox> mailboxes;
}
