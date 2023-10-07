package TopperWorld.ATMInterface;

import java.util.Scanner;

public class AtmInterface {

	private static double balance=1000;
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("Welcome to the ATM");
		
		while(true)
		{
			System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Availabe Balance\n4. Exit");
			System.out.println("Please select the operation");
			
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				{	
					Withdraw();
					break;
				}
				case 2:
				{	
					Deposit();
					break;
				}
				case 3:
				{
					CheckBalance();
					break;
				}
				case 4:
				{
					System.out.println("Thank You!");
					System.exit(0);
				}
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
		}
		
	}
	
	private static void CheckBalance()
	{
		System.out.println("Available Balance is : Rs."+balance);
	}
	
	private static void Withdraw()
	{
		System.out.println("Enter withdraw amount : ");
		double amount=s.nextDouble();
		
		if(amount<=balance && amount>0)
		{
			balance=balance-amount;
			System.out.println("Withdrawal Successful\nAvailable Balance is : Rs "+balance);
		}
		else
		{
			System.out.println("Insufficient amount!");
		}
	}
	
	private static void Deposit()
	{
		System.out.println("Enter Deposit amount : Rs");
		double amount=s.nextDouble();
		
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposit Successful\nAvailable Balance is : Rs "+balance);
		}
		else
		{
			System.out.println("Please enter a positive amount!");
		}
	}
	
}
