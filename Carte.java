package application;

public class Carte {
	
	private ImageCarte i;
	private int x;
	private int y;
	private boolean dansChien;
	
	public Carte(int x, int y, ImageCarte i) {
		this.i = i;
		this.x = x;
		this.y = y;
		dansChien = false;

	}
	
	public void setX(int x){
		this.x = x;
		i.setX(x);
	}
	
	public void setY(int y){
		this.y = y;
		i.setY(y);
	}
	
	public ImageCarte getImage(int i){
		return this.i;
	}
}
