import java.util.Scanner;

public class Menu {
	public void runTournament() {
		// welcome message
		System.out.println("Welcome to the tournament simulator!\n");
		System.out.println("Do you want to run a tournament? (Y/N)");
		Scanner scanner = new Scanner(System.in);
		String run = scanner.nextLine();
		if(!run.equals("N") && !run.equals("Y")) {
			System.out.println("Please enter a valid input.\n");
		}
		else if(run.equals("N")) {
			System.out.println("Ok, bye!");
			System.exit(0);
		}
		
		System.out.println("How many matches should be in each sub-tournament?\n");
		
		int matchCount = Integer.parseInt(scanner.nextLine());
		Tournament tournament = new Tournament();
		//tournament.subTournaments.add()
		
		
		
		System.out.println("Weapon options: \nLong:\n  Halberd, Lance, Two-handed sword,\nMedium:\n  Staff, Hand-and-a-half sword, Rapier,\nShort:\n"
				+ "Dagger, Cestus, Gladius\n");
		System.out.println();
	}
}
