package application;

import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;

public class ImageCarte {
	
	private int x;
	private int y;
	private int z;
	private int numero;
	private CarteType couleur;
	private Image image;
	private Image face_cachee;
	private ImageView devant_image;
	private ImageView cachee_image;
	private String chemin;
	static private String chemin_face_cachee = "file:.res/ressources-100/yugioh_cache.png";
	static long halfFlipDuration = 1000;
	
	public ImageCarte(String chemin, CarteType c, int n){
		this.chemin = chemin;
		this.image = new Image(chemin);
		this.face_cachee = new Image(chemin_face_cachee);
		this.couleur = c;
		this.numero = n;
	}
	
	public void changerImage(){
		setImage(this.image);
	}

	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public CarteType getType(){
		return this.couleur;
	}
	
	public String getChemin(){
		return this.chemin;
	}
	

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	private void setImage(Image image) {
		this.image = image;
	}

}
