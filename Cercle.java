public class Cercle extends Point{ // Hérite de Point
	protected double rayon;

	// Constructeur sans argument
	public Cercle(){
		// Appel implicite au contructeur de la superclasse
		setRayon(0);
		System.out.println("Constructeur de Cercle: "+this);
	}

	// Constructeur
	public Cercle(double r,int a,int b){
		super(a,b);// Appel au constructeur de la superclasse
		setRayon(r);
		System.out.println("Constructeur de Cercle: "+this);
	}

	// Ajuste le rayon du cercle
	public void setRayon(double r){
		rayon=(r>=0.0 ? r : 0.0);
	}

	// Transmet le rayon du cercle
	public double getRayon(){
		return rayon;
	}

	// Calcule l'aire du cercle
	public double aire(){
		return Math.PI*rayon*rayon;
	}

	// Convertit le cercle vers une chaîne
	public String toString(){
		return "Centre = "+" ["+x+","+y+"]"+" ; Rayon = "+rayon;
	}
	
	// Finaliseur
	protected void finalize(){
		System.out.println("Finaliseur de Cercle: "+this);
		super.finalize(); // Appelle le finaliseur de la superclasse
	}
}