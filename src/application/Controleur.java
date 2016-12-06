package application;

public class Controleur {
	public Modele modele;
	public Vue vue;
	
	public Controleur(Modele m, Vue v)
	{
		this.modele = m;
		this.vue = v;
	}
	
	public void setControleur(Modele m)
	{
		this.modele = m;
	}
}
