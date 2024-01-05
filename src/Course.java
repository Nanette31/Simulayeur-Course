import java.util.Random;
import java.util.Scanner;

// Course hippique de 12 à 20 cheveaux.
// un tiercé s'intéresse au 3 premier du classement (18 chevaux);
// le quarté au 4 premier du classement (16 chevaux);
// Le quinté au 5 premier du classement (20 chevaux);

public class Course {

	public static void main(String[] args) {
		int horses = 0;
		int[] number = {};
		boolean jeuxEnCours = true;
		
		while(jeuxEnCours == true ) {
			System.out.println("Combien de cheveaux doit il y avoir dans la course ?");
			Scanner scan = new Scanner(System.in);
			horses = scan.nextInt();
			
			System.out.println("Quels type de courses voulez vous ?");
			System.out.println("[1] Tiercé | [2] Quarté | [3] Qunité |"); 
			Scanner scanchoix = new Scanner(System.in);
			int choix = scanchoix.nextInt();
			if  (choix >= 1 && choix <= 3) {
				int position =0;
				while (position < choix + 2) {
					Random rand = new Random();
					int randomNum = rand.nextInt((horses - 0) + 1) + 0;
					number[position] = randomNum;
					position++;
				}
				System.out.println("La cours a les numeros : [ ");
				for (int i = 0 ; i < number.length ; i++) {
					System.out.println(number[i] + " ");
				}
				System.out.println("]");
			} else {
				System.out.println("Mauvaise saisit");
			}
			System.out.println("Voulez vous continuer ? Si oui tapez la touche [O]");
			Scanner continu = new Scanner(System.in);
			if (continu.next().toLowerCase() != "o") {
				jeuxEnCours = false;
			}
		}
	}
}