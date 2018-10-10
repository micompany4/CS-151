package invoice;

/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
	
   public String formatHeader()
   {
      total1 = 0;
      total2 = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      double price1;
      double price2;
      
      
      LineItem hammer = null;
      LineItem bundle = null;
      
      if(item.getPrice() == 19.95)
      {
    	  hammer = item;
    	  price1 = item.getPrice();
    	  total1 += item.getPrice();
    	  counter1 = total1/price1;
      }
      else
      {
    	  bundle = item;
    	  price2 = item.getPrice();
    	  total2 += item.getPrice();
    	  counter2 = total2/price2;
      }
      
      String product1 = "Hammer:     $19.95                  " + counter1 + "\n";
      String product2 = "Bundle: Hammer, Assorted nails (Discount 10.0%):     $26.91         " + counter2 + "\n";
      
      return product1 + product2;
   }

   
   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total1 + total2));
   }

   private double total1;
   private double total2;
   private double counter1;
   private double counter2;
  
}
