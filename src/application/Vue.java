package application;

import java.util.Observable;
import java.util.Observer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class Vue implements Observer{
	
	private Modele modele;
	private Stage fenetre = new Stage();
	private Group root = new Group();
	private Scene scene = new Scene(root, 1024,768, Color.BURLYWOOD);
	private ArrayList<ImageCarte> imagesCartes = new ArrayList<>();
	
	private int positionCarteX=150;
	private int positionCarteY=70;
	private int positionChienX;
	private int positionChienY;
	
	private Button quitter = new Button();
	private Button distribution = new Button();
	private int positionPaquetX;
	private int positionPaquetY;
	private ArrayList<ImageCarte> cartesVues = new ArrayList<>();

	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Vue (Modele m)
	{
		initBouton();
		initImage();
		modele=m;
		fenetre.setTitle("Tarot - POIRIER - CREMERY - S3D");
		fenetre.setScene(scene);
		fenetre.sizeToScene();
		
		fenetre.show();
			
	}
	
	public void initImage()
	{
		for(int i=0;i<modele.getPaquetCartes().size();i++){
			if(modele.getPaquetCartes().get(i).getType() == CarteType.Atout){
				this.cartesVues.add(new ImageCarte(positionPaquetX,positionPaquetY,modele.getPaquetCartes().get(i),new ImageView("file:./ressources-100/" + modele.getPaquetCartes().get(i).getNumero() +".jpg")));
			}
			else if(modele.getPaquetCartes().get(i).getType() == CarteType.Excuse){
				this.cartesVues.add(new ImageCarte(positionPaquetX, positionPaquetY, modele.getPaquetCartes().get(i),new ImageView("file:./ressources-100/excuse.jpg")));
			}
			else{
				this.cartesVues.add(new ImageCarte(positionPaquetX, positionPaquetY, modele.getPaquetCartes().get(i),new ImageView("file:./ressources-100/"+modele.getPaquetCartes().get(i).getNumero()+modele.getPaquetCartes().get(i).getType()+".jpg")));
			}
		}
	}
	
	public void initBouton(){
		
		quitter.setLayoutX(10);
		quitter.setLayoutY(700);
		quitter.setText("Quitter");
		quitter.setPrefSize(100, 50);
		
		distribution.setLayoutX(200);
		distribution.setLayoutY(20);
		distribution.setText("Distribution");
		distribution.setPrefSize(100, 30);
		
		root.getChildren().add(distribution);
		root.getChildren().add(quitter);
	}
	
	public ImageCarte assoCarteModeleVue(Carte c){
		for(int j=0;j<cartesVues.size();j++){
			if(cartesVues.get(j).getCarte().getNumero() == c.getNumero() && cartesVues.get(j).getCarte().getType() == c.getType()){
				return cartesVues.get(j);
			}
		}
		return null;
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
	
	public Button getQuitter(){
		return quitter;
	}
	
	public Button getDistribution(){
		return distribution;
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
