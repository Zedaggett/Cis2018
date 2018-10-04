package bin;

public class HangmanApplication {

	public static void main (String[] args) {
		/* Current game state represented by looped asterics masking remainder of letters
		 * Prompt user to guess letter
		 *Receive answer via user
		 *If answer is true, apply to current game state
		 *Repeat 
		 */
		HangmanGame newG = new HangmanGame(); //Creating a new instance of a game of Hangman
		newG.createWord(); //Creating a new word to be masked
		newG.createHint(); //Creating a new hint
		newG.createMask(); //Creating a mask to disguise the hidden word
		newG.createScanner(); //Create scanner to take info from user
		
	}
}
