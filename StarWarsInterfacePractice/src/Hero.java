
public class Hero implements Character {
	
	public String weapon = "The Hero";
	
	public String getWeapon() {
		return weapon;
	}
	
	public void attack() {
		System.out.println("The hero attacks the enemy");
	}
	
	public void heal() {
		System.out.println("The hero heals you");
	}
	
}
