package application;

public class Carte {
	
	private ImageCarte i;
	private boolean dansChien;
	
	public Carte(ImageCarte i) {
		this.i = i;
		dansChien = false;

	}
	
	public ImageCarte getImage(int i){
		return this.i;
	}
}
