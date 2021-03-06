import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO ; 
import java.io.* ; 

public class Pomme extends Acc implements Mangeable { // Une Pomme est un Accessoire qui a la propriété d'être Mangeable

	/* Attributs */

	private double poids ; // poids de la pomme en kg
	private double rayon ; // rayon de la pomme en cm

	/* Constructeurs */

	public Pomme (){
		super("Pomme") ; // Appel au cosntructeur Acc(categorie)
		rayon = 3.0d + (Math.random() * 4.0d) ; // rayon dans [3;7[ cm
		poids = ( ( (4.0d / 3000.0d) * Math.PI) * Math.pow(rayon, 3) ) ;
	}

	/* Méthodes */
	/* // ancienne version 
	public void dessiner ( Graphics g, Monde m) {
		int tc = m.getTailleCase() ;
		g.setColor(new Color(255, 0, 0)) ; // couleur courante devient rouge
		g.fillOval( getX()*tc, getY()*tc, tc, tc) ; // cercle plein
	}
	*/
	@Override
	public String toString(){
		return String.format("%s %.2fcm", super.toString(), rayon) ; // toString d'Acc
		// exemple : pomme No 1 0.26kg 3.9cm
	}

	public double getPoids(){ // retourne le poids de la pomme
		return poids ;
	}

	public double getRayon(){ // retourne le rayon de la pomme
		return rayon ;
	}

	private void setRayon(double rayon){ // change la valeur du rayon de la pomme
		this.rayon = rayon ;
		return ;
	}
	
	public void dessiner(Graphics g, Monde m) {

		int tc = m.getTailleCase();
		File pomme;
		Image image;

		try {
			pomme = new File("./images/pomme.png");
			image = ImageIO.read(pomme);
			g.drawImage(image, getX()*tc, getY()*tc, tc/2, tc/2, m); 
		} catch (IOException e){
			System.out.println(e.getMessage());
		}

	}
}
