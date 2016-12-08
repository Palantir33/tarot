package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage;



public class Main extends Application{
	
	private Modele modele;
	private Vue vue;
	

	@Override
	public void start(Stage fenetre) throws Exception {
		// TODO Auto-generated method stub
		
		this.modele = new Modele();
		this.vue = new Vue(this.modele);
		modele.addObserver(vue);
		
	}
	
    public static void main(String[] args)
    {
        launch(args);
    }

}
