package LoopHomework;

public class Loop
{

	public Loop() {
		int outLoop = 0; //Creating outLoop variable
		int inLoop = 1; //Creating inLoop variable
		
		for (outLoop = 0; outLoop < 5; outLoop++) { //Creating parameters for variables
		 for (inLoop = 1; inLoop <= outLoop; inLoop++){
			System.out.print(inLoop); //Printing to console
		}
		 System.out.println();
		}
	}
//Making a mask for the word "Horse"
	public void createMask() {
		String word = ("Horse");
		for (int i = 0; i < word.length(); i++)
		{
			System.out.print("*");
		}
		
	}
}

//Still figuring out how to count back down from 4....