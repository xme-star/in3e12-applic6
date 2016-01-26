public class Point{
	protected int x,y; // Coordonées du point

	// Constructeur sans argument
	public Point(){
		// Appel implicite au contructeur de la superclasse
		setPoint(0,0);
		System.out.println("Constructeur de Point: "+this);
	}

	// Constructeur
	public Point(int a,int b){
		setPoint(a,b);
		System.out.println("Constructeur de Point: "+this);
	}

	// Ajuste l'abscisse et l'ordonnée du point
	public void setPoint(int a,int b){
		x=a;
		y=b;
	}

	// Retourne l'abscisse
	public int getX(){
		return x;
	}

	// Retourne l'ordonnée
	public int getY(){
		return y;
	}

	// Convertit le point vers une chaîne
	public String toString(){
		return "["+x+","+y+"]";
	}
	
	// Finaliseur
	protected void finalize(){
		System.out.println("Finaliseur de Point: "+this);
	}
}