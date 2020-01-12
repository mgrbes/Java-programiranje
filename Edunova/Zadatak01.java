package hr.grbes;

public class Zadatak01 {

	public static void main(String[] args) {
		double suma=0,max=0,min=999999;
		double a=0;
		for(int i=1;i<=24;i++) {
			a=Math.random();
			System.out.println(a);
			suma+=a;
			if(a>max) {
				max=a;
			}
			if(a<min) {
				min=a;
			}
			
			
		}
		System.out.println("suma="+suma+", max ="+max+", min ="+min);
	}

}
