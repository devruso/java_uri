package uri_java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri_1006 {
	
	
	
	public static void main(String[] args) throws IOException {
		 
     Locale.setDefault(Locale.US); 
     
     Scanner input = new Scanner(System.in);
     
     float a,b,c,d;
     
     a = input.nextFloat();
     b = input.nextFloat();
     c = input.nextFloat();
     
     d = (a*2 + b*3 + c*5)/10;
     
     System.out.printf("MEDIA = %.1f%n",d);
     
 
    }
}
