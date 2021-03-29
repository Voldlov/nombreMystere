package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuFin {
	//méthode
	public static void fin (int fin, int jeu) throws NumberFormatException, IOException {
		if (fin == 0) {
			System.out.println("Vous avez gagné ! Que faire ?");
			menu(jeu);
			
		}
		else {
			System.out.println("Vous avez perdu... Que faire ?");
			menu(jeu);
		}
	}
	public static void menu (int jeu) throws NumberFormatException, IOException {
		System.out.println("-1- Rejouer -1-");
		System.out.println("-2- Autre mode de jeu -2-");
		System.out.println("-3- Menu principal -3-");
		System.out.println("-4- Quitter -4-");
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		int saisie = Integer.parseInt(entree.readLine());
		switch (saisie) {
		case 1:
			//Rejouer
			if (jeu == 1) {
				//relancer jeu 1
			}
			else {
				//relancer jeu 2
			}			
			break;
		case 2:
			//Autre mode de jeu
			if (jeu == 1) {
				//lancer jeu 2
			}
			else {
				//lancer jeu 1
			}	
			break;
		case 3:
			//Retour au menu principal - FINI
			MenuDebut.main(null);
			break;
		case 4:
			//sortir du jeu - FINI
			System.out.println("Merci d'avoir joué !");
			System.exit (0);			
			break;

		default:
			break;
		}
	}
	
}
