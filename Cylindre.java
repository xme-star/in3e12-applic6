// Définition de la classe Cylindre
public class Cylindre extends Cercle{
	protected double hauteur; // Hauteur du cylindre

	// Constructeur sans argument
	public Cylindre(){
		// Appel implicite au constructeur de la superclasse
		setHauteur(0);
	}

	// Constructeur
	public Cylindre(double h,double r,int a,int b){
		super(r,a,b);
		setHauteur(h);
	}

	// Ajuste la hauteur du cylindre
	public void setHauteur(double h){
		hauteur=(h>=0 ? h : 0);
	}

	// Retourne la hauteur du cylindre
	public double getHauteur(){
		return hauteur;
	}

	// Calcule l'aire du cylindre
	public double aire(){
		return 2*super.aire()+2*Math.PI*rayon*hauteur;
	}

	// Calcul le volume du cylindre
	public double volume(){
		return super.aire()*hauteur;
	}

	// Convertit le cylindre vers une chaîne
	public String toString(){
		return super.toString()+"; Hauteur = "+hauteur;
	}
}