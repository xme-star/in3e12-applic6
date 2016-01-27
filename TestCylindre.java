// Application testant la classe Cylindre
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestCylindre{
	public static void main(String args[]){
		Cylindre c=new Cylindre(5.7,2.5,12,23);
		DecimalFormat precision2=new DecimalFormat("0.00");
		String sortie;

		sortie="L'abscisse vaut "+c.getX()+"\nL'ordonnée vaut "+c.getY()+"\nLe rayon vaut "+c.getRayon()+"\nLa hauteur vaut "+c.getHauteur();
		
		c.setHauteur(10);
		c.setRayon(4.25);
		c.setPoint(2,2);

		sortie+="\n\nLa nouvelle position, rayon et la hauteur de c valent\n"+c+"\nL'aire vaut "+precision2.format(c.aire())+"\nLe volume vaut "+precision2.format(c.volume());

		JOptionPane.showMessageDialog(null,sortie,"Démontre la classe Cylindre",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}