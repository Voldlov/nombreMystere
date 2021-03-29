package game1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import menu.MenuFin;

public class JeuDeviner {
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
	public JeuDeviner () throws NumberFormatException, IOException {
		//g�n�ration du nombre al�atoire
		funite = (int)Math.random() * 10;
		fdizaine = (int)Math.random() * 100;
		fcentaine = (int)Math.random() * 1000;
		fmillier = (int)Math.random() * 10000;
		nombre = funite + fdizaine + fcentaine + fmillier;
		//essais remit � 0
		essais = 0;
		//lancement
		debut();
	}
	
	//M�thodes
	public void debut () throws NumberFormatException, IOException {
		System.out.println("Vous devez trouver un nombre � 4 chiffres, quel est votre nombre ?");
		//r�cup�ration du nombre
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		saisie = Integer.parseInt(entree.readLine());
		//d�coupe
		unite(saisie);
		dizaine(saisie);
		centaine(saisie);
		millier(saisie);
		
		//comparaison
		String sortie = comparaison(millier,fmillier) + comparaison(centaine,fcentaine) + comparaison(dizaine,fdizaine) + comparaison(unite,funite);
		System.out.println(sortie);
		if (sortie == "====") {
			MenuFin.fin(0, 1);
		}
		//decompte
		else if (essais >= 10) {
			System.out.println("C'�tait" + nombre);
			MenuFin.fin(1, 1);
		}
		else if (essais < 10) {
			essais++;
			debut();
		}
	}
	public int unite (int nb) {
		//avoir les unit�s
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
	
	public String comparaison (int nb1, int nb2) {
		if (nb1 == nb2) {
			//�guale
			return "=";
		}
		else if (nb1 > nb2) {
			//Sup�rieur
			return "+";
		}
		else if (nb1 < nb2) {
			//Inf�rieur
			return "="
					+ "-";
		}
		//mauvaise saisie, impossible
		return "?";
		
	}

}
