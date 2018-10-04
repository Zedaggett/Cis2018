package bin;

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
	
	public void createWord() 
	{
		String word = "cat";
		
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(i);
			System.out.println(word.charAt(i));
		}
	}
	

	
		public void createMask()
		{
			String word = "cat";
			
			for (int i = 0; i < word.length(); i++)
			{
				System.out.println ("*");
			}
		}
}
