package application;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class Vue implements Observer{
	
	private Modele modele;
	private Stage fenetre = new Stage();
	private Group root = new Group();
	private Scene scene = new Scene(root, 1024, 768,Color.GREEN);
	private ArrayList<ImageCarte> imagesCartes = new ArrayList<>();
	private int positionCarteX=150;
	private int positionCarteY=70;
	private int positionChienX;
	private int positionChienY;
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	public void initialisationImage()
	{
		this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/excuse.jpg", CarteType.Atout,0));
		
		for(int i=1;i<22;i++)
		{
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+".jpg",CarteType.Atout,i));
		}
		
		for(int i=1;i<15;i++)
		{
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Carreau.jpg",CarteType.Carreau,i));
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Coeur.jpg",CarteType.Coeur,i));
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Pique.jpg",CarteType.Pique,i));
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Trèfle.jpg",CarteType.Trefle,i));

		}
	}
	
	public Vue (Modele m)
	{
		initialisationImage();
		this.modele = m;
		this.fenetre.setTitle("Tarot de fils de pute");
		fenetre.setScene(scene);
		fenetre.sizeToScene();
		fenetre.show();
	}
	
	public ArrayList<ImageCarte> getImageCartes(){
		return imagesCartes;		
	}
	
	public int getPositionCarteX(){
		return positionCarteX;
	}
	
	public int getPositionCarteY(){
		return positionCarteY;
	}
	
	public int getPositionChienX(){
		return positionChienX;
	}
	
	public int getPositionChienY(){
		return positionChienY;
	}
	
	public void setPositionCarteX(int positionCarteX){
		this.positionCarteX = positionCarteX;
	}
	
	public void setPositionCarteY(int positionCarteY){
		this.positionCarteY = positionCarteY;
	}
	
	public void setPositionChienX(int positionChienX){
		this.positionChienX = positionChienX;
	}
	
	public void setPositionChienY(int positionChienY){
		this.positionChienY = positionChienY;
	}
}
