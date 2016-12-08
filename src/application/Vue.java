package application;

import java.util.Observable;
import java.util.Observer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Vue (Modele m)
	{
		initBouton();
		initImage();
		
		fenetre.setTitle("Tarot - POIRIER - CREMERY - S3D");
		fenetre.setScene(scene);
		fenetre.sizeToScene();
		fenetre.show();
			
	}
	
	public void initImage()
	{
		this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/excuse.jpg", CarteType.Atout));
		
		for(int i=1;i<22;i++)
		{
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+".jpg",CarteType.Atout));
		}
		
		for(int i=1;i<15;i++)
		{
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Carreau.jpg",CarteType.Carreau));
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Coeur.jpg",CarteType.Coeur));
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Pique.jpg",CarteType.Pique));
			this.imagesCartes.add(new ImageCarte("file:./res/ressources-100/"+i+"Trèfle.jpg",CarteType.Trefle));

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
		
		
		distribution.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				//Faire distribution
			}
		});
		
		quitter.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.exit(0);
			}
		});
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
