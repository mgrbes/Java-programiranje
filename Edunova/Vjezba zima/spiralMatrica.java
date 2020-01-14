package hr.grbes;

import javax.swing.JOptionPane;

public class spiralMatrica {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));

		int niz[][] = new int[a][a];

		int red1 = a - 1;
		int stup1 = a - 1;
		int red2 = 0;
		int stup2 = 0;
		int brojMatrice = 1;

		while (brojMatrice <= a*a) {
			
			for (int i = red1; i >= red2; i--) {
				niz[red1][i] = brojMatrice;
				brojMatrice++;
				
			}
			
			for (int i = red1 - 1; i >= red2; i--) {
				niz[i][stup2] = brojMatrice;
				brojMatrice++;
			}
			for (int i = stup2+1; i <= stup1; i++) {
				niz[red2][i] = brojMatrice;
				brojMatrice++;
			}
			for (int i = red2+1; i <= red1 - 1; i++) {
				niz[i][stup1] = brojMatrice;
				brojMatrice++;
			}
			stup2++;
			red2++;
			stup1--;
			red2--;
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(niz[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
