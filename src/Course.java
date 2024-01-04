
import java.util.Random;
import java.util.Scanner;

// Course hippique de 12 à 20 cheveaux.
// un tiercé s'intéresse au 3 premier du classement (18 chevaux);
// le quarté au 4 premier du classement (16 chevaux);
// Le quinté au 5 premier du classement (20 chevaux);

public class Course {

	public static void main(String[] args) {
		Random rand = new Random();

		// Liste des courses :
		String [] tabNomCourses = {"Tiercé", "Quarté", "Quinté"};
							
		int nbChevauxArrivee = 0; // 

		// Saisie le nom de la course :

		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour veuillez saisir le nom de la course recherché :");
		String nomCourse = scan.next();
		for (int i = 0 ; i < tabNomCourses.length ; i++) {
			if (tabNomCourses[i].equals(nomCourse)) {
				nbChevauxArrivee = i + 3;
				break;
			}
		}
		System.out.println(nbChevauxArrivee);
		//int noCheval = rand.nextInt(17) +1;
	}				
}



