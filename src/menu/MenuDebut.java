package menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import game1.JeuDeviner;
import game2.JeuFaireDeviner;

public class MenuDebut {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("-- Devine nombre --");
		System.out.println("-1- Deviner un nombre -1-");
		System.out.println("-2- Faire deviner un nombre -2-");
		System.out.println("-3- Crédit & explication -3-");
		System.out.println("-4- Quitter -4-");
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		int saisie = Integer.parseInt(entree.readLine());
		if (saisie == 1) {
			//appeler le jeu 1
			JeuDeviner jeu1 = new JeuDeviner();
		}
		else if (saisie ==  2) {
			//appeler le jeu 2
			JeuFaireDeviner jeu2 = new JeuFaireDeviner();
		}
		else if (saisie == 3) {
			//appeler les crédits - FINI
			Credit.afficher();
		}
		else if (saisie == 4) {
			//sortir du jeu - FINI
			System.out.println("Merci d'avoir joué !");
			System.exit (0);
		}
		else {
			
		}
	}
}
