package object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test {

	public static void main(String[] args) throws Exception{
		Radnik radnici[]=new Radnik[10];
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("radnici.txt"));
		for(int i=0;i<10;i++) {
			radnici[i]=(Radnik)input.readObject();
			System.out.println(radnici[i].getId()+radnici[i].getIme()+radnici[i].getPlaca());
		}
		
		
		
		
	}
	
	
	
}
