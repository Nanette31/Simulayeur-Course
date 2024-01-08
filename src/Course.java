import java.util.Random;
import java.util.Scanner;

// Course hippique de 12 à 20 cheveaux.
// un tiercé s'intéresse au 3 premier du classement (18 chevaux);
// le quarté au 4 premier du classement (16 chevaux);
// Le quinté au 5 premier du classement (20 chevaux);

public class Course {

	public static void main(String[] args) {
		int horses = 0;
		int[] number = new int [5];
		boolean gamesInProgerss = true;
		
		while(gamesInProgerss == true ) {
			System.out.println("Combien de cheveaux doit il y avoir dans la course ?");
			Scanner scan = new Scanner(System.in);
			horses = scan.nextInt();
			
			System.out.println("Quels type de courses voulez vous ?");
			System.out.println("[1] Tiercé | [2] Quarté | [3] Qunité |"); 
			Scanner scanChoice = new Scanner(System.in);
			int choice = scanChoice.nextInt();
			if  (choice >= 1 && choice <= 3) {
				int position =0;
				while (position < choice + 2) {
					Random rand = new Random();
					int randomNum = rand.nextInt(horses) + 1;
					number[position] = randomNum;
					position++;
				}
				System.out.print("La cours a les numeros : [ ");
				for (int i = 0 ; i < number.length ; i++) {
					System.out.print(number[i] + " ");
				}
				System.out.println("]");
			} else {
				System.out.println("Mauvaise saisit");
			}
			System.out.println("Voulez vous continuer ? Si oui tapez la touche [O]");
			Scanner continuous = new Scanner(System.in);
			String continueOrNot = continuous.next();
			if (!continueOrNot.equalsIgnoreCase("o")) {
				gamesInProgerss = false;
			}
		}
	}
}