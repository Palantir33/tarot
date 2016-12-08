package application;

import java.util.ArrayList;
import java.util.Collection;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.Node;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class ImageCarte {
	
	private int x;
	private int y;

	private CarteType couleur;

	private Carte m_carte;
	static private String chemin_face_cachee = "file:.res/ressources-100/yugioh_cache.png";

	private Image image_cache = new Image(chemin_face_cachee);
	
	private ImageView devant_imagev;
	private ImageView cachee_imagev;
	
	private String chemin;
	private Image image;
	static long halfFlipDuration = 1000;
	
	public ImageCarte(String chemin, CarteType c){
		
		devant_imagev = new ImageView();
		cachee_imagev = new ImageView();
		
		cachee_imagev.setImage(image_cache);
		/*
		this.chemin = chemin;
		this.image = new Image(chemin);
		this.face_cachee = new Image(chemin_face_cachee);
		this.couleur = c;
		this.numero = n;
		*/
		
		
	}
	
	public void changerImage(){
		setImage(this.image);
	}
	
	Collection<Node> getNodes(){
        ArrayList<Node> al = new ArrayList<>();
        al.add(devant_imagev);
        al.add(cachee_imagev);
        return al;
	}

	SequentialTransition flip(SequentialTransition sequential) {

        final RotateTransition rotateOutFront = new RotateTransition(Duration.millis(100), devant_imagev);
        rotateOutFront.setInterpolator(Interpolator.LINEAR);
        rotateOutFront.setAxis(Rotate.Y_AXIS);
        rotateOutFront.setFromAngle(90);
        rotateOutFront.setToAngle(0);

        final RotateTransition rotateInBack = new RotateTransition(Duration.millis(100), cachee_imagev);
        rotateInBack.setInterpolator(Interpolator.LINEAR);
        rotateInBack.setAxis(Rotate.Y_AXIS);
        rotateInBack.setFromAngle(0);
        rotateInBack.setToAngle(90);

        rotateInBack.setOnFinished(event ->  {for (int i=0; i<18; i++) {
            devant_imagev.setOpacity(1);
            cachee_imagev.setOpacity(0);
        }});


        SequentialTransition sequential2 = new SequentialTransition();
        sequential2.getChildren().addAll(rotateInBack, rotateOutFront);
        sequential.getChildren().add(sequential2);
        return sequential;
		}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
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
