package application;

public class Carte {
	
	private CarteType type;
	private int numero;
	private boolean dansChien;
	
	public Carte(CarteType t, int n){
		dansChien = false;
		numero = n;
		type = t;
	}
	
	public int getNumero(){
		return numero;
	}

	public CarteType getType(){
		return type;
	}
	
	public boolean estDansChien(){
		return dansChien;
	}
	
	public void setDansChien(boolean dansChien){
		this.dansChien = dansChien;
	}
	
	//FAIRE METHODE POUR COMPARER.
}
