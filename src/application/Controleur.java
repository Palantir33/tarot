package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controleur {
	public Modele modele;
	public Vue vue;
	
	public Controleur(Modele m, Vue v)
	{
		this.modele = m;
		this.vue = v;
		
		vue.getQuitter().setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.exit(0);
			}
		});
		vue.getDistribution().setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				//Faire distribution
			}
		});
	}
	
	public void setControleur(Modele m)
	{
		this.modele = m;
	}
}
