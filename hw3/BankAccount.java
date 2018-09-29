package frames;

/*
 * Creates a new Object, BankAccount, that implements Comparable
 * compareTo is overridden to compare by a different means
 */
public class BankAccount implements Comparable<BankAccount>
{
	private double balance;
	private String name;

	//ctor for BankAccount that takes a name and balance for the account
	public BankAccount(double balance, String name)
	{
		this.name = name;
		this.balance = balance;
	}

	public double getBalance()
	{
		return balance;
	}


	public String getName()
	{
		return name;
	}

	//compareTo function that compares the BankAccounts by balance
	@Override
	public int compareTo(BankAccount other) 
	{
		if(balance < other.balance)
		{
			return -1;
		}
		if(balance > other.balance)
		{
			return 1;
		}
		return 0;
	}


}
