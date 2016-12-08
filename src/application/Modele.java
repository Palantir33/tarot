package application;

import java.util.ArrayList;
import java.util.Collections;
import javafx.beans.Observable;
import javafx.beans.InvalidationListener;

public class Modele extends java.util.Observable{
	
	private Vue vue;
	private ArrayList<Carte> paquetCarte = new ArrayList<>();
	private ArrayList<Carte> chien = new ArrayList<>();
	private ArrayList<Joueur> joueurs = new ArrayList<>();

	
	
	public Modele() {
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();
		Joueur j3 = new Joueur();
		Joueur j4 = new Joueur();
		
		joueurs.add(j1);
		joueurs.add(j2);
		joueurs.add(j3);
		joueurs.add(j4);
	}
	
	public void initialiserPaquetCartes(){
		
		for(int i=1;i<=14;i++)
		{
			paquetCarte.add(new Carte(CarteType.Carreau,i));
			paquetCarte.add(new Carte(CarteType.Coeur,i));
			paquetCarte.add(new Carte(CarteType.Pique,i));
			paquetCarte.add(new Carte(CarteType.Trefle,i));
		}
		
		for(int i=1;i <=21;i++)
		{
			paquetCarte.add(new Carte(CarteType.Atout, i));
		}
		
		paquetCarte.add(new Carte(CarteType.Excuse,0));
		melangerPaquetCartes();
	}
	
	public void melangerPaquetCartes(){
		Collections.shuffle(paquetCarte);
	}
	
	public ArrayList<Carte> getChien(){
		return chien;
	}
	
	public ArrayList<Carte> getPaquetCartes(){
		return paquetCarte;
	}
	
	public ArrayList<Joueur> getJoueurs(){
		return joueurs;
	}
	

}
