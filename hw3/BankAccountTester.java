package frames;

import java.util.*;

/*
 * Tester for the BankAccount Class
 * Makes sure the compareTo function is sorting the accounts in increasing order
 */
public class BankAccountTester 
{
	public static void main(String[] args)
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();

		accounts.add(new BankAccount(1000000, "Bill"));
		accounts.add(new BankAccount(500, "Cindy"));
		accounts.add(new BankAccount(0.99, "Darrell"));
		accounts.add(new BankAccount(24000, "Bruno"));
		accounts.add(new BankAccount(9000.01, "Goku"));
		accounts.add(new BankAccount(500, "Gordon"));

		//uses compareTo() to sort the array list
		Collections.sort(accounts);
		
		//prints out the order of bank accounts
		for(BankAccount ba : accounts)
		{
			System.out.println(ba.getName() + "'s balance:" + ba.getBalance());
		}

	}

}
