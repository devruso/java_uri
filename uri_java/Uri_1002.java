
package uri_java;
import java.util.Locale;
import java.io.IOException;
import java.util.Scanner;

public class Uri_1002 {
	
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
        double N,a;
        double pi = 3.14159;
        
        N = input.nextDouble();
		
        a= pi * Math.pow(N, 2);
        
        System.out.printf("A=%.4f%n", a);
        
        input.close();
    }
}
