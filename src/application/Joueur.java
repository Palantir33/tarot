package application;

import java.util.ArrayList;

public class Joueur {
	
	public ArrayList<Carte> cartes = new ArrayList<Carte>();
	
	public Joueur(){
		
	}
	
	public void ajouterCartesaJoueur(Carte c){
		cartes.add(c);
	}
	
	public void supprimerCartesaJoueur(Carte c){
		cartes.remove(c);
	}
	
	public ArrayList<Carte> getCartes(){
		return cartes;
	}
}
