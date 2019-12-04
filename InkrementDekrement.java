package hr.grbes;

public class InkrementDekrement {
	public static void main(String[] args) {
		int i=1,j=1;
		int t=i;
		
		System.out.println(t);//1
		System.out.println(++j);//2
		System.out.println(j++);//2
		System.out.println(i);//1
		System.out.println(i--);//1
		System.out.println(--i);//-1
		i=t-2 + ++j - i--;//-1+4+1=4
		System.out.println(i);
		int b=1;
		System.out.println(b++);//1
		System.out.println(b--);//2
		System.out.println(--b);//0
		System.out.println(b++);//0
		System.out.println(++b);//2
		
	}
}
