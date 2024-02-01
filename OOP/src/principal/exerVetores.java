package principal;

import java.util.Locale;
import java.util.Scanner;

public class exerVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas vezes você vai digitar? ");
		int vezes = sc.nextInt();
		int[] numeros = new int[vezes];

		for (int i=0; i<vezes; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();

		}

		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i=0; i<vezes; i++) {
			if (numeros[i] < 0) {
				System.out.printf("%d%n", numeros[i]);
						
			}
 		}




		sc.close();
	}
}