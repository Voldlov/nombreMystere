package game2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import menu.MenuFin;

public class JeuFaireDeviner {
	//Attributs
	int saisie;
	int millier;
	int centaine; 
	int dizaine; 
	int unite;
	
	int nombre;
	int fmillier;
	int fcentaine; 
	int fdizaine; 
	int funite;	
	
	int essais;
	
	//Get & Set
	
	//Constructeur
	public JeuFaireDeviner() throws NumberFormatException, IOException {
		System.out.println("Donner un nombre à 4 chiffres.");
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		saisie = Integer.parseInt(entree.readLine());
		unite = unite(saisie);
		dizaine = dizaine(saisie);
		centaine = centaine(saisie);
		millier = millier(saisie);
		nombre = 5555;
		essais = 0;
	}
	//Méthodes
	public void debut() throws NumberFormatException, IOException {
		System.out.println(nombre);
		if (nombre == saisie) {
			System.out.println("Le nombre a été trouvé en " + essais + "coups.");
			MenuFin.fin(1, 2);
		}
		else if (essais >= 10) {
			MenuFin.fin(0, 2);
		}
		else {
			BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
			funite = unite(nombre);
			fdizaine = dizaine(nombre);
			fcentaine = centaine(nombre);
			fmillier = millier(nombre);
			nombre = plusMoins("", funite) + plusMoins("", fdizaine) + plusMoins("", fcentaine) + plusMoins("", fmillier);
		}
	}
	
	public int plusMoins (String entree, int nb) {
		switch (entree) {
		case "=":
			
			break;
		case "+":
			nb++;
			break;
		case "-":
			nb--;
			break;
		default:
			break;
		}
		return nb;
	}
	
	public int unite (int nb) {
		//avoir les unités
		return nb % 10;
	}
	
	public int dizaine (int nb) {
		//avoir les dizaines
		return (nb / 10) % 10;
	}	

	public int centaine (int nb) {
		//avoir les centaines
		return ((nb / 10) / 10) % 10;
	}
	public int millier (int nb) {
		//avoir les centaines
		return (((nb / 10) / 10) / 10) % 10;
	}
}
