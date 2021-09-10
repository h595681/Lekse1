package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		String inntekt = showInputDialog("skriv inntekten");
		double x = Double.parseDouble(inntekt);
		double Trinn1 = x * 0.017;
		double Trinn2 = x * 0.04;
		double Trinn3 = x * 0.132;
		double Trinn4 = x * 0.162;
		if (x <= 184800) {showMessageDialog(null, "Du skattes ikke, heldiggris!");}
		else if (x <= 260100) {showMessageDialog(null, "Du må betale " + Trinn1 + "kr i skatt");}
		else if (x <= 651250) {showMessageDialog(null, "Du må betale " + Trinn2 + "kr i skatt");}
		else if (x <= 1021550) {showMessageDialog(null, "Du må betale " + Trinn3 + "kr i skatt");}
		else {showMessageDialog(null, "Du må betale " + Trinn4 + "kr i skatt");}

	}

}
