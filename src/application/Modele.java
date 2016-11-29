package application;

import java.util.ArrayList;
import java.util.Collections;
import javafx.beans.Observable;
import javafx.beans.InvalidationListener;

public class Modele extends java.util.Observable{
	
	private Vue vue;
	private ArrayList<Carte> deckCarte = new ArrayList<>();
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
}
