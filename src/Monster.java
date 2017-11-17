
public class Monster extends Creature {
	
	protected String name;
	protected int atck;
	public Monster(int posX, int posY, int health, String name, int atck) {
		super(posX, posY, health);
		this.name = name;
		this.atck = atck;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAtck() {
		return atck;
	}
	public void setAtck(int atck) {
		this.atck = atck;
	}
	
	
	

}
