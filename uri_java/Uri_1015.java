package uri_java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Uri_java1015 {
	
	public static void main(String[] args) throws IOException {
		 
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
        
        float x1,y1,x2,y2;
        double d;
        x1 = input.nextFloat();
        y1 = input.nextFloat();
        x2 = input.nextFloat();
        y2 = input.nextFloat();
        
        
        d = Math.sqrt(Math.pow(x2- x1,2) + Math.pow(y2-y1,2));
        
        System.out.printf("%.4f%n", d);
        
        
        
    }
}
