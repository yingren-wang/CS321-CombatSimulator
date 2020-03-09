
// archetype of the weapon
enum Archetype implements TournamentArchetype { SHORT, MIDIUM, LONG };

public class Weapon {
	public int attackRating;
	public int defenseRating;
	public Archetype archetype; 	// stores weapon type
}
