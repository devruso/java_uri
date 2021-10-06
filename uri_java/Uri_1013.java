package uri_java;

import java.io.IOException;
import java.util.Scanner;


public class Uri_1013 {
	public static void main(String[] args) throws IOException {
		 
        Scanner input = new Scanner(System.in);
        
        int a,b,c,x,y,z;
               
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        x = (a+b + Math.abs(a-b))/2;
        y = (b+c + Math.abs(b-c))/2;
        z = (x+y + Math.abs(x-y))/2;
        
        System.out.println(z+" eh o maior");
    }
}
