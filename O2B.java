package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2B {

	public static void main(String[] args) {
		int i=0;
		for(i=0; i<10; i++) {int x = 0;
		String poeng = showInputDialog("Poengsum til elev" + (i+1));
		x = Integer.parseInt(poeng);
		if (x < 0 || 100 < x) {System.out.println("Ugyldig verdi, pr?v igjen");}
		else if (x >= 90) {System.out.println("A");}
		else if (x >= 80 && x < 90) {System.out.println("B");}
		else if (x >= 60 && x < 80) {System.out.println("C");}
		else if (x >= 50 && x < 60) {System.out.println("D");}
		else if (x >= 40 && x < 50) {System.out.println("E");}
		else {System.out.println("F");}}
	}

}
