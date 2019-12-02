public class Pomme extends Acc implements Mangeable {
	
	/* Attributs */
	
	private double poids ; // poids de la pomme en kg
	private double rayon ; // rayon de la pomme en cm

	/* Constructeurs */
	
	public Pomme (){
		super("Pomme") ;
		rayon = 3.0 + (Math.random() * 4.0) ; // rayon dans [3;7[ cm
		poids = ( ( (4.0 / 3000.0) * Math.PI) * Math.pow(rayon, 3) ) ;
	}

	/* Méthodes */
	
	@Override
	public String toString(){
		return String.format("%s %.2fcm", super.toString(), rayon) ;
		// exemple : pomme No 1 0.26kg 3.9cm
	}

	public double getPoids(){
		return poids ;
	}
	
	public double getRayon(){
		return rayon ; 
	}
	
	public void setRayon(double rayon){
		this.rayon = rayon ; 
		return ; 
	}
	
}