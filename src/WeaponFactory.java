import java.util.*;

public class WeaponFactory {
	private Map<String, Integer> atkRatings;
	private Map<String, Integer> defRatings;
	
	public void setAtkRatings() {
		atkRatings.put("Halberd", 3);
		atkRatings.put("Lance", 1);
		atkRatings.put("Two-handed sword", 2);
		atkRatings.put("Staff", 1);
		atkRatings.put("Hand-and-a-half sword", 3);
		atkRatings.put("Rapier", 3);
		atkRatings.put("Dagger", 4);
		atkRatings.put("Cestus", 5);
		atkRatings.put("Gladius", 3);
	}
	public void setDefRatings() {
		defRatings.put("Halberd", 0);
		defRatings.put("Lance", 2);
		defRatings.put("Two-handed sword", 2);
		defRatings.put("Staff", 3);
		defRatings.put("Hand-and-a-half sword", 2);
		defRatings.put("Rapier", 1);
		defRatings.put("Dagger", 1);
		defRatings.put("Cestus", 0);
		defRatings.put("Gladius", 3);
	}
	
	public Map<String, Integer> getAtkRatings() {
		return atkRatings;
	}
	
	public Map<String, Integer> getDefRatings() {
		return defRatings;
	}
	
	public Weapon makeWeapon() {
		Weapon weapon = new Weapon();
		Archetype a = null;
		for(Map.Entry<String, Integer> entry: atkRatings.entrySet()) {
			if(entry.getKey().equals("Halberd") || entry.getKey().equals("Lance") || entry.getKey().equals("Two-haanded sword")) {
				a = Archetype.LONG;
			}
			else if(entry.getKey().equals("Staff") || entry.getKey().equals("Hand-and-a-half sword") || entry.getKey().equals("Rapier")){
				a = Archetype.MIDIUM;
			}
			else if(entry.getKey().equals("Dagger") || entry.getKey().equals("Cestus") || entry.getKey().equals("Gladius")){
				a = Archetype.SHORT;
			}
			weapon.archetype = a;
			weapon.attackRating = entry.getValue();
			
		}
		
		return weapon;
	}
}
