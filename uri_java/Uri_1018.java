package uri_java;

import java.util.Scanner;
import java.io.IOException;

public class Uri_1018 {
	public static void main(String[] args) throws IOException {
		 
		Scanner input = new Scanner(System.in);
		int n,n100,n50,n20,n10,n5,n2,n1,c,n0;
		
		n = input.nextInt();
		
		n0=n;
		
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
		
		System.out.println(n0);
		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");

 
    }
}
