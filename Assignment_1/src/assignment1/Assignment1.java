package assignment1;

import java.util.Scanner;

public class Assignment1 
{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int u_l = 100;
		int l_l = 1;
		boolean guessednum = false;
		int rando = (u_l - l_l)/3  ;
		while(guessednum == false) 
		{	
			
			System.out.print("Please guess the number?");
			int guess = sc.nextInt();
			if (rando < guess)
			{
				System.out.println("Your number is larger");
			}
			if (rando > guess)
			{
				System.out.println("Your number is smaller");
			}
			if (rando == guess)
			{
				System.out.println("You guessed the number");
				System.out.println(rando);
				guessednum = true;
			
			}
		}
	}

}	
