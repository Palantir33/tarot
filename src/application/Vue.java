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
	//private Scene scene = new Scene(root, 1024, 768,Color.GREEN);
	private ArrayList<ImageCarte> imagesCartes = new ArrayList<>();
	private int positionCarteX=150;
	private int positionCarteY=70;
	private int positionChienX;
	private int positionChienY;
	private Button jouer = new Button();
	private Button quitter = new Button();
	private Button distribution = new Button();

	

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
		this.jouer.setLayoutX(482);
		this.jouer.setLayoutY(384);
		this.jouer.setText("Jouer");
		this.jouer.setPrefSize(100, 50);
		
		this.quitter.setLayoutX(10);
		this.quitter.setLayoutY(700);
		this.quitter.setText("Quitter");
		this.quitter.setPrefSize(100, 50);
		
		root.getChildren().add(jouer);
		root.getChildren().add(quitter);
		
		fenetre.setTitle("Tarot de bg, tu coco");
		fenetre.setScene(scene);
		fenetre.sizeToScene();
		fenetre.show();
		
		jouer.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.out.println("Jouer");
				root.getChildren().remove(jouer);
				
				distribution.setLayoutX(200);
				distribution.setLayoutY(20);
				distribution.setText("Distribution");
				distribution.setPrefSize(100, 30);
				root.getChildren().add(distribution);
				scene.setFill(Color.GREENYELLOW);
			}
		});
		
		quitter.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.exit(0);
			}
		});
		
		
		/*this.modele = m;
		this.fenetre.setTitle("Tarot de fils de pute");
		this.distribution.setLayoutX(200);
		this.distribution.setLayoutY(334);
		this.distribution.setText("Distribution");
		root.getChildren().add(distribution);
		fenetre.setScene(scene);
		fenetre.sizeToScene();
		initialisationImage();
		fenetre.show();*/
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
