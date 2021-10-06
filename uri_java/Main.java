package uri_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	int sum;
	int a,b;
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		sum = a + b;
		
		
		System.out.println("SOMA = " + sum);
	}

}
