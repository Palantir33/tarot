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
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
