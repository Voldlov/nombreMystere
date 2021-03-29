package menu;

import java.io.IOException;

public class Credit {
	//méthode
	public static void afficher () throws NumberFormatException, IOException {
		System.out.println("|-| Devine Nombre |-|");
		System.out.println("");
		System.out.println("|Langage - Java");
		System.out.println("|Auteur - GAIO DOS SANTOS Lucas");
		System.out.println("|Date de rendu - Lundi 29 Mars 2021");
		System.out.println("|But : Ce jeu est un examen de fin de module, celui de JAVA.");
		System.out.println("|Le jeu : Deux modes de jeu, le premier où l'utilisateur doit trouver un nom, le second où c'est à l'utilisateur de faire trouver un nombre.");
		MenuDebut.main(null);
	}
}
