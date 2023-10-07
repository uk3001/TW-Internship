package TopperWorld.NumberGuessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String args[])
	{
		int num1=1;
		int num2=100;
		Random random=new Random();
		int number=random.nextInt(num2-num1+1)+num1;
		int maxattempts=5;
		int attempts=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome to the Number Guessing Game! \nYou have to select a number between "+num1+" and "+num2+"\nYou have "+maxattempts+" attempts to guess the number");
		
		while(attempts<maxattempts)
		{
			System.out.println("Enter your guess : ");
			int guess=s.nextInt();
			attempts++;
			
			if(guess<num1 || guess>num2)
			{
				System.out.println("Your guess is out of range");
			}
			else if(guess==number)
			{
				System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
				break;
			}
			else if(guess<number)
			{
				System.out.println("Your guess Number is Smaller\n"+(maxattempts-attempts)+" Attempts left");
			}
			else
			{
				System.out.println("Your guess number is Higher\n"+(maxattempts-attempts)+" Attempts left");
			}
			
			if(maxattempts-attempts==0)
			{
				System.out.println("You've run out of attempts\nThe Correct number is "+number);
			}
		}
		
		
		
		
	}
}
