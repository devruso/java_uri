package uri_java;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;


public class Uri_1005 {
	
	 public static void main(String[] args) throws IOException {
		
		 Locale.setDefault(Locale.US); 
	    Scanner input = new Scanner(System.in);    
	    
	    
		 float a,b;
		 double avg;
		 
		 a = input.nextFloat();
		 b = input.nextFloat();
		 
		 avg = ((a*3.5)+(b*7.5))/11;
		 
		 System.out.printf("MEDIA = %.5f%n",avg);
	 
	    }
}
