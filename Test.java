// Démontre les appels aux constructeurs de la superclasse et de la
// sous-classe

public class Test{
	public static void main(String args[]){
		Cercle cercle1,cercle2;

		cercle1=new Cercle(4.5,72,29);
		cercle2=new Cercle(10,5,5);

		cercle1=null; // Marque pour le ramasse miettes
		cercle2=null; // Marque pour le ramasse miettes
		System.gc(); // Appelle au ramasse miettes
	}
}