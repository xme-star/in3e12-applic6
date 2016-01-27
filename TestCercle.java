// Application testant la classe Cercle
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestCercle{
	public static void main(String args[]){
		Cercle c=new Cercle(2.5,37,43);
		DecimalFormat precision2=new DecimalFormat("0.00");
		String sortie;

		sortie="\n L'abscisse vaut "+c.getX()+"\n L'ordonnée vaut "+c.getY()+"\n Le rayon vaut "+c.getRayon();

		c.setRayon(4.25);
		c.setPoint(2,2);

		sortie+="\n\nLa nouvelle position et le rayon de c valent\n"+c+"\nL'Aire vaut "+precision2.format(c.aire());
		JOptionPane.showMessageDialog(null,sortie,"Démontre la classe Cercle",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}