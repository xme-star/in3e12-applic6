// Appliation testant la classe Point
import javax.swing.JOptionPane;

public class TestPoint{
	public static void main(String[] args){
		Point p=new Point(72,115);
		String sortie;

		sortie="L'abscisse vaut "+p.getX()+"\n L'ordonnée vaut "+p.getY();
		
		p.setPoint(10,10);

		// Appel implicite à p.toSTring()
		sortie+="\n\nLa nouvelle position de p vaut "+p;

		JOptionPane.showMessageDialog(null,sortie,"Démontre la classe Point",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}