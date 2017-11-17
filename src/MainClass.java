import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String userInput = "";
		MoorManager newGame = new MoorManager();
		newGame.generateMonsters(5);
		System.out.println("As a Paranormal Agent under her Magesties Government, you have been sent to the Barren Moor to stop the end of the world \n  "
				+ "The end of the world...funny you'd thought, but the old man yelling about staying away as you got here was when it got a bit weird \n"
				+ "You've wandered for days, but now you are lost.  You know you must find an object called the Forbidden Idol of The Dark Ones, but the \n"
				+ " mist has got thicker as you've wandered further in");
		Scanner sc = new Scanner(System.in);

		
		
		while(!userInput.equals("quit"))
		{
			 userInput = sc.nextLine();
			 newGame.isValidMove(userInput);
			 System.out.println(newGame.newPlayer.posX);
			 System.out.println(newGame.newPlayer.posY);
			 newGame.foundChest();
			 newGame.foundMonster();
			 
			 if (newGame.newPlayer.getHealth() == 0 && userInput.equals("kill self"))
			 {
				 System.out.println("You took the easy way out rather than look for and destroy the forbidden idol of the Dark Ones");
				 System.out.println("Know that your selfish action will doom the rest of humanity as your corpse rots in the moor");
				 System.out.println("At least you avoided the Dark gods");
				 System.out.println("-----------------------------------");
				 System.out.println("Game Over.  Type quit to quit or play again(Do whatever)");
				 userInput = sc.nextLine();
				 
				 if (userInput.equals("quit"))
				 {
					 System.out.println("Running away are you?  YOU YELLOW BAS...");
				 }
				 else
				 {
					 System.out.println("-----------------------------------");
				 }
			 }
			 
			 if (newGame.newTC.isFound())
			 {
				 System.out.println("You found the idol...You can end this madness.");
				 System.out.println("A shame your wandering in the moor has taken its toll.  Without realising you became a wandering soul, unable to destroy the idol");
				 System.out.println("Your sacrifice was in vain.  You see the Dark gods destroy the world around you and when they are done tormenting the living, you become their plaything");
				 System.out.println("-----------------------------------");
				 System.out.println("Game Over.  Type quit to quit or play again(Do whatever)");
				 
				 userInput = sc.nextLine();
				 
				 if (userInput.equals("quit"))
				 {
					 System.out.println("I understand your apprehension at dying all over again");
				 }
				 else
				 {
					 System.out.println("-----------------------------------");
				 }
			 }
			 
			 if (newGame.newPlayer.getHealth() == 0 )
			 {
				 System.out.println("You tried, but eventually the constant encounters with creatures from another realm took their toll");
				 System.out.println("The gods have played you like a fiddle, before they could truly break through the barrier between Earth and their realms");
				 System.out.println("At least it spares you their full torment");
				 
				 System.out.println("-----------------------------------");
				 System.out.println("Game Over.  Type quit to quit or play again(Do whatever)");
				 
				 userInput = sc.nextLine();
				 
				 if (userInput.equals("quit"))
				 {
					 System.out.println("I understand your apprehension at dying all over again");
				 }
				 else
				 {
					 System.out.println("-----------------------------------");
				 }
			 }
		}
	}
}
