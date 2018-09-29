package frames;

import java.time.ZoneId;
import java.time.ZonedDateTime;


/*
 * Class that calculates the amount of days between my birthday to today
 */
public class SinceBirth 
{
	private static int days;	//keeps track of the in between days

	public static void main(String[] args)
	{
		//creates the date for today
		ZonedDateTime todayDate = ZonedDateTime.now();
		
		
		ZoneId timeZone = ZoneId.of("America/Los_Angeles");
		
		//creates the date for my birthday: May 18, 1998
		ZonedDateTime birthday = ZonedDateTime.of(1998, 5, 18, 0, 0, 0, 0, timeZone);

		
		ZonedDateTime rightYear = birthday;
		int counter = 1;
		
		//counts how many days there are between 1998 to this year
		while(rightYear.getYear() != todayDate.getYear())
		{
			rightYear = birthday.plusDays(counter);
			counter++;
			days++;
		}
		System.out.println(rightYear);

		ZonedDateTime rightMonth = rightYear;
		counter = 1;
		
		//counts how many days there are between January 1st, to this month
		while(rightMonth.getMonthValue() != todayDate.getMonthValue())
		{
			rightMonth = rightYear.plusDays(counter);
			counter++;
			days++;
		}
		System.out.println(rightMonth);


		ZonedDateTime rightDay = rightMonth;
		counter = 1;
		
		//counts how many days there are between the first of this month to today
		while(rightDay.getDayOfMonth() != todayDate.getDayOfMonth())
		{
			
			rightDay = rightMonth.plusDays(counter);
			counter++;
			
			days++;
		}
		System.out.println(rightDay +"\n");


		System.out.println("Number of days from my birthday to today: " + days);
	}

}
