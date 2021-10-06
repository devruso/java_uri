package uri_java;

import java.io.IOException;
import java.util.Scanner;

public class Uri_1019 {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		int n,s,m,h;
		
		n = input.nextInt();
		
		h = n/3600;
		m = (n/60)%60;
		s = n%60;
		
		System.out.println(h+":"+m+":"+s);
		
        
 
    }
}
