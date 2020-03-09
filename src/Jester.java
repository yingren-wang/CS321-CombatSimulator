
public class Jester {
	public String result;
	public int onePhysical;
	public int twoPhysical;
	public boolean predicted;
	
	public void commentOnStart(Fighter one, Fighter two) {
		onePhysical = one.reach + one.speed + one.strength;
		twoPhysical = two.reach + two.speed + two.strength;
		if(onePhysical == twoPhysical) {
			result = "even";
		}
		else if(onePhysical > twoPhysical) {
			result = one.name;
		}
		else {
			result = two.name;
		}
		
		System.out.println("Fighter " + one.name + "'s physical attribute in total: " + onePhysical + ".\n" + 
				"Fighter " + two.name + "'s physical attribute in total: " + twoPhysical + ".\n" +
				"According to the physical attributes, winner will be: " + result + "!\n");
	}
	
	public void commentOnMiddle(Fighter f) {
		System.out.println("Fighter " + f.name + " has recieved half of the damage he has available before losing!");
	}
	
	// pass in the winner's name to compare with the prediction
	public void commentOnEnd(String name) {
		System.out.println("Fighter " + name + " won the game! Congrats!\n");
		if(name.equals(result)) {
			predicted = true;
			System.out.println("My prediction was right\n");
		}
		else {
			predicted = false;
			System.out.println("My prediction was wrong\n");
		}
		
		
	}
}
