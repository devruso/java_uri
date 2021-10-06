package uri_java;


import java.io.IOException;
import java.util.Scanner;

public class Uri_1021 {
	public static void main(String[] args) throws IOException {
		 
		Scanner input = new Scanner(System.in);
		int n,n100,n50,n20,n10,n5,n2,n1,c,t;
		int m100,m50,m25,m10,m05,m01,m0,z;
		float n0;
		
		n0 = input.nextFloat();
		
		t=n0*100;
		
		n=t/100;
		m0=t%100;
		
		n100 = n/100;
		c= n%100;
		
		n50 = c/50;
		c= c%50;
		
		n20 = c/20;
		c=c%20;
		
		n10 = c/10;
		c=c%10;
		
		n5 = c/5;
		c=c%5;
		
		n2 = c/2;
		c=c%2;
		
		n1 = c;
		
		m100 = c;
		
		m50= m0/50;
		z=m0%50;
		m25=z/25;
		z=m0%25;
		m10=z/10;
		z=m0%10;
		m05=z/5;
		z=m0%5;
		m01=z;
		
		System.out.println("NOTAS:");
		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");
		
		System.out.println("MOEDAS:");
		System.out.println(m100+" moeda(s) de R$ 1.00");
		System.out.println(m50+" moeda(s) de R$ 0.50");
		System.out.println(m25+" moeda(s) de R$ 0.25");
		System.out.println(m10+" moeda(s) de R$ 0.10");
		System.out.println(m05+" moeda(s) de R$ 0.05");
		System.out.println(m01+" moeda(s) de R$ 0.01");
    }
}
