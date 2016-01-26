import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TestHeritage{ // Démontre la relation "est un"
	public static void main(String[] args){
		Point pointRef,p;
		Cercle cercleRef,c;
		String sortie;
		p=new Point(30,50);
		c=new Cercle(2.7,120,89);
		sortie="Point p :"+p.toString()+"\nCercle c : "+c.toString();
		// Utilise le relation "est un pour référencer un
		// cercle à l'aide d'une référence point
		pointRef=c;
		sortie+="\n\nCercle c (via pointRef): "+pointRef.toString();
		// Remplace le type de la référence à la superclasse
		// contenue par pointRef vers une référence à la
		// sous-classe cercleRef
		cercleRef=(Cercle)pointRef;
		sortie+="\n\nCercle c (via cercleRef) : "+cercleRef.toString();
		DecimalFormat precision2=new DecimalFormat("0.00");
		sortie+="\nAire de c (via cercleRef): "+precision2.format(cercleRef.aire());
		// Tente de se référer à un objet point à l'aide
		// d'une référence à cercle
		if(p instanceof Cercle){
			cercleRef=(Cercle)p; // ligne 41 de TestHeritage.java
			sortie+="\n\nremplacement de type réussi";
		}else{
			sortie+="\n\np ne référence pas un Cercle";
		}
		JOptionPane.showMessageDialog(null,sortie,"Démontre la relation \"et un\"",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}