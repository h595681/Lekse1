package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		double i, fact=1;
		String faktor = showInputDialog("Hvilket nummer skal vi fakultere?");
		double n = Integer.parseInt(faktor);
		for(i=1; i <= n; i++) {fact=fact*i;}
		System.out.println( "Fakultetet til " + n + " er: " + fact);
	}

}
