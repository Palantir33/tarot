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
		for(int i = 0;i < vue.getImageCartes().size();i++)
		{
			Carte c = new Carte(vue.getPositionCarteX(), vue.getPositionCarteY(), vue.getImageCartes().get(i));
			paquetCarte.add(c);
		}
		
		melangerPaquetCartes();
	}
	
	public void melangerPaquetCartes(){
		Collections.shuffle(paquetCarte);
	}
	
	public ArrayList<Carte> getChien(){
		return chien;
	}
	
	public ArrayList<Joueur> getJoueurs(){
		return joueurs;
	}
	
	public void setVue(Vue v)
	{
		this.vue = v;
	}
}
