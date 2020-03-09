import java.util.Random;

public class Fighter {
	// fighter's attributes
	public int strength;
	public int reach;
	public int speed;
	public Weapon weapon;
	String name;
	
	// compare self to other fighter
	public boolean strongerThan(Fighter f) {
		if (strength > f.strength)
			return true;
		else
			return false;
	}
	
	// compare reach
	public boolean longerReachedThan(Fighter f) {
		if (reach > f.reach)
			return true;
		else
			return false;
	}
	
	// compare speed
	public boolean fasterThan(Fighter f) {
		if (speed > f.speed)
			return true;
		else
			return false;
	}
	
	public int getAttackPerformance() {
		int attackPerformance = 0;
		for(int i = 0; i < weapon.attackRating; i++) {
			Random rand = new Random(); 
			// generate random integers in range 1 to 6;
			attackPerformance += (rand.nextInt(6) + 1);
		}
		return attackPerformance;
	}
	
	public int getDefensePerformance() {
		int defensePerformance = 0;
		for(int i = 0; i < weapon.defenseRating; i++) {
			Random rand = new Random(); 
			// generate random integers in range 1 to 6;
			defensePerformance += (rand.nextInt(6) + 1);
		}
		return defensePerformance;
	}
	
	/*
	public void requestWeapon() {
		WeaponFactory factory = new WeaponFactory();
		weapon = factory.makeWeapon(a);
	}
	*/
	
	
}
