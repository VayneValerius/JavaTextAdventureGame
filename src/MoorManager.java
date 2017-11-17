import java.util.ArrayList;
import java.util.Random;

public class MoorManager {
	
	Random rand = new Random();
	
	ArrayList<Monster> monsterList = new ArrayList<Monster>();
	
	int lastX = 0;
	int lastY = 0;
	
	private int mapX = 40, mapY = 40;
	protected Entity[][] map = new Entity [mapX][mapY];
	int randomTCX = rand.nextInt(mapX);
	int randomTCY = rand.nextInt(mapY);
	int randomPlayerX = rand.nextInt(mapX);
	int randomPlayerY = rand.nextInt(mapY);
	
	protected Player newPlayer = new Player(randomPlayerX, randomPlayerY, 10, 1, 0);
	protected TreasureChest newTC = new TreasureChest(randomTCX,randomTCY, false);
	
	
	MoorManager(){
	map[newPlayer.getPosX()][newPlayer.getPosY()] = newPlayer;
	map[newTC.getPosX()][newTC.getPosY()] = newTC;
	}
		
	public void playerInput(String input)
	{
		map[newPlayer.getPosX()][newPlayer.getPosY()] = null;
		switch(input)
		{
			case "north":
				newPlayer.setPosY(newPlayer.posY += 1);
				for (Monster currentMonster : monsterList)
				{
					int randomMonX = rand.nextInt(mapX);
					int randomMonY = rand.nextInt(mapY);
					currentMonster.setPosX(randomMonX);
					currentMonster.setPosY(randomMonY);
				}
				break; 
				
			case "east":
				newPlayer.setPosX(newPlayer.posX += 1);
				for (Monster currentMonster : monsterList)
				{
					int randomMonX = rand.nextInt(mapX);
					int randomMonY = rand.nextInt(mapY);
					currentMonster.setPosX(randomMonX);
					currentMonster.setPosY(randomMonY);
				}
				break;
			
			case "south":
				newPlayer.setPosY(newPlayer.posY -= 1);
				for (Monster currentMonster : monsterList)
				{
					int randomMonX = rand.nextInt(mapX);
					int randomMonY = rand.nextInt(mapY);
					currentMonster.setPosX(randomMonX);
					currentMonster.setPosY(randomMonY);
				}
				break;
				
			case "west":
				newPlayer.setPosX(newPlayer.posX -= 1);
				for (Monster currentMonster : monsterList)
				{
					int randomMonX = rand.nextInt(mapX);
					int randomMonY = rand.nextInt(mapY);
					currentMonster.setPosX(randomMonX);
					currentMonster.setPosY(randomMonY);
				}
				break;
				
			case "kill self":
			{
				newPlayer.setHealth(0);
				break;
			}
			
			case "look":
			{
				if (newPlayer.getPosX() == newTC.getPosX()+5 || newPlayer.getPosX() == newTC.getPosX()-5 && newPlayer.getPosY() == newTC.getPosY()+5 || newPlayer.getPosY() == newTC.getPosY()-5 )
				{
					System.out.println("You feel the energies of the Dark Gods is concentrated near...You are close");
				}
				else
				{
					System.out.println("More fog, how unique.");
				}
				break;
			}
			case "list":
			{
				System.out.println("Commands are: north, east, south, west for movement, look to see ahead and there are secret commands too");
				break;
			}
			
			default:
			{
				System.out.println("Type a valid input stupid.  Type \"list\", to get a list");
				break;
			}
				
		}
		
		map[newPlayer.getPosX()][newPlayer.getPosY()] = newPlayer;
	}
	
	public void isValidMove(String input)
	{
		input = input.toLowerCase();
		if (newPlayer.posY + 1 == mapY  && input.equals("north") || newPlayer.posY == 0 && input.equals("south") ||newPlayer.posX+1 == mapX  && input.equals("east") || newPlayer.posX == 0 && input.equals("west") )
		{
			System.out.println("Not A Valid Move");
		}
		else
		{
			lastX = newPlayer.getPosX();
			lastY = newPlayer.getPosY();
			playerInput(input);
		}
	}
	
	public void foundChest()
	{
		if (newPlayer.posX  == newTC.posX && newPlayer.posY  == newTC.posY)
		{
			System.out.println("Well Done!");
			newTC.setFound(true);
		}
	}
	
	public void generateMonsters(int ammount)
	{	
		for (int i = 0; i < ammount; i++)
		{
			int rX = rand.nextInt(mapX);
			int rY = rand.nextInt(mapY);
			Monster newMonster = new Monster(rX, rY, 10, null, 1);
			monsterList.add(newMonster);
		}
	}
	
	public void foundMonster()
	{
		for (Monster currentMonster : monsterList)
		{
			if (newPlayer.posX  == currentMonster.posX && newPlayer.posY  == currentMonster.posY)
			{
				int random = rand.nextInt(5);
				
				switch (random)
				{
					case 1:
					{
						System.out.println("You wander into a clearing in the moor.  For a second you feel peace but then you feel something touch your leg.");
						System.out.println("A manic assembly of shadowy tentacles is under your feet and reaching out for you.");
						System.out.println("You scream as the adhoc creature tries to envelop you in its embrace and you try to run");
						break;
					}
					case 2:
					{
						System.out.println("Lost in the fog, you've wandered for what feels like an enternity, if only you had listened to the crazy man before you entered.");
						System.out.println("As you think about his warning, you hear a howl and are beset by wolves.  Well, things that look like wolves");
						System.out.println("Its almost as if someone who had heard about the concept of wolves, had tried to describe them to someone with no idea how anatomy works.");
						System.out.println("Unfortunatly you get a good look at them up close.  As you begin to run, you know that the image of the creatures will haunt you for the rest of your life");
						System.out.println("That however could be only 5 minutes away.");
						break;
					}
					case 3:
					{
						System.out.println("The fog around you becomes darker, and you feel a static charge making the hairs on your skin stand on end");
						System.out.println("A giant eye appears in the fog, and suddenley what should only be a sight hinderence, becomes a physical object");
						System.out.println("As you pass through the darkness to escape the eye, it feels like you are running at brick walls");
						System.out.println("Its lucky your sanity lost you long ago, as you feel you begin to see what looks like walls appear in the swirling fog, and then what strangely feels like razors");
						System.out.println("As you finally manage to escape the eyes gaze, by slamming into the mist, you feel that your clothes are soaked and dyed red");
						break;
					}
					case 4:
					{
						System.out.println("The moors are silent, or so you thought.  A sudden clicking noise makes you turn on your heel.");
						System.out.println("A weird two legged creature emerges from the fog, making noises that make your skin crawl");
						System.out.println("You run, but not before the creature lunges at you and appendeges launch from its body");
						System.out.println("The spikes hit you and you feel blood pour from your wounds");
						break;
					}
					case 5:
					{
						System.out.println("The fog around you begins to clear and unveils a woman");
						System.out.println("Her frame is shaking and you see her clothes are torn and her hair matted by dirt and twigs");
						System.out.println("You go over to see if she needs help, but as you get close, suddenly you see her judder multiple times in a way that makes you want to retch more than her odour");
						System.out.println("More arms grow from her body as you hear bones break and flesh tear.  Her stomach explodes covering you in fluids and rotting flesh");
						System.out.println("Your eyes stream with tears from the stench, as a twisted version of the woman wraps around you");
						System.out.println("You manage to break away and run, but not before you hear another sickening crack, as she snaps your arm and some of your ribs break");
						break;
					}
				}
				newPlayer.setHealth(newPlayer.getHealth()-currentMonster.atck);
				
				newPlayer.setPosX(lastX); newPlayer.setPosX(lastY);
			}
		}
	}

}
