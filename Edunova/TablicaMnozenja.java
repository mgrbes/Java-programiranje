package hr.grbes;

public class TablicaMnozenja {

	public static void main(String[] args) {
		int niz[][]=new int[15][15];
		for(int i=1;i<=15;i++) {
			for(int j=1;j<=15;j++) {
				System.out.println(i+" * "+j+"="+i*j);
			}
		}

	}

}
