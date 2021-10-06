package uri_java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri_1012 {
	
	public static void main(String[] args) throws IOException {
		 
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double a, b, c;
        double triang,circ,trapez,quadra,retang;
        double pi = 3.14159;
        
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        triang = c*a/2;
        circ = pi *(c*c);
        trapez = ((a + b)/2) * c;
        quadra = b*b;
        retang = a*b;
        
        System.out.printf("TRIANGULO: %.3f%n",triang);
        System.out.printf("CIRCULO: %.3f%n",circ);
        System.out.printf("TRAPEZIO: %.3f%n",trapez);
        System.out.printf("QUADRADO: %.3f%n",quadra);
        System.out.printf("RETANGULO: %.3f%n",retang);
        
    }
}
