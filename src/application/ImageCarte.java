package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageCarte {
	
	private int numero;
	private CarteType couleur;
	private Image image;
	private Image face_cachee;
	private String chemin;
	final private String chemin_face_cachee = "file:.res/ressources-100/cache.jpg";
	
	public ImageCarte(String chemin, CarteType c, int n){
		this.chemin = chemin;
		this.image = new Image(chemin);
		this.face_cachee = new Image(chemin_face_cachee);
		this.numero = n;
		this.couleur = c;
	}
}
