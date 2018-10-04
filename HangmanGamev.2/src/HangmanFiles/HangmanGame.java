package HangmanFiles;

import java.util.Scanner;

public class HangmanGame {
	/*
	 * Rules that need to be followed:
	 * Game initiate
	 * Choose word
	 * Guess limit = 5
	 * Hint limit = 1
	 * 
	 */
	public static void main (String[] args) {}
	

	public void createMask()
		{
			String word = "Maine";
			
			for (int i = 0; i < word.length(); i++)
			{
				System.out.print ("*");
			}
		}
	public String welcome = "Guess a letter";
			
			static void createScanner()
			{
				Scanner sc = new Scanner (System.in);
			
				{
					System.out.print("String: " + sc.nextInt());
				}
				sc.close();
				 
			}
	
}


