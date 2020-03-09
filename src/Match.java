
public class Match {
	public Fighter fighter1;
	public Fighter fighter2;
	public int oneDmged;
	public int twoDmged;
	public Jester jester = new Jester();
	
	public void playMatch() {
		jester.commentOnStart(fighter1, fighter2);
		oneDmged = fighter2.getAttackPerformance() - fighter1.getDefensePerformance();
		twoDmged = fighter1.getAttackPerformance() - fighter2.getDefensePerformance();
		
		// if they have received half of the damage before losing
		if (oneDmged >= 5) {
			jester.commentOnMiddle(fighter1);
		}
		
		if (twoDmged >= 5) {
			jester.commentOnMiddle(fighter2);
		}
		
		if (oneDmged >= 10 && twoDmged >= 10) {
			playMatch();
		}
		else if(oneDmged >= 10) {
			jester.commentOnEnd(fighter2.name);
		}
		else if(twoDmged >= 10) {
			jester.commentOnEnd(fighter1.name);
		}
		
	}
	
	public void signalMiddleToJester() {
		jester = new Jester();
	}
}
