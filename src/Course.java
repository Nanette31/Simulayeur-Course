
import java.util.HashMap;
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
		String [] tabNameRaces = {"Tiercé", "Quarté", "Quinté"};



		int nbHorsesArrival = 0; // Nombre de chevaux a l'arrivée!

		// Saisie le nom de la course :

		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour veuillez saisir le nom de la course recherché :");
		String NameRaces = scan.next();
		for (int i = 0 ; i < tabNameRaces.length ; i++) {
			if (tabNameRaces[i].toLowerCase().equals(NameRaces.toLowerCase())) {
				nbHorsesArrival = i + 3;	
			}
			//HashMap<Integer> set = new
			//HashMap<Integer>();
			//				while (set.size() < 3) {
			//				int nombreAleatoire = rand.nextInt(17) +1;
			//					System.out.println("les 3 nombreAleatoire sont : "  + set );
			//			} 
		}
		//System.out.println(nbHorsesArrival);

	}				
}
//while ( nbHorsesArrival < 18  )


