package hr.grbes;

import javax.swing.JOptionPane;

public class zbrajanjeMatrica {

	public static void main(String[] args) {
		int a = 4, b = 4, c = 4, d = 4;

		int niz1[][] = new int[a][b];
		int niz2[][] = new int[c][d];
		int matricazbroj[][] = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				niz1[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Unesite broj za mjesto [" + i + "][" + j + "]"));
			}
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				niz2[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Unesite broj za mjesto [" + i + "][" + j + "]"));
			}
		}
		System.out.println();
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				System.out.print(niz1[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				System.out.print(niz2[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				matricazbroj[i][j] = niz1[i][j] + niz2[i][j];
			}
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				System.out.print(matricazbroj[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
