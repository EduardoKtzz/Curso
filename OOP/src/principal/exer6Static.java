package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer6Static {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor do dollar: ");
		double dollar = sc.nextDouble();

		System.out.println();
		System.out.println("Quantos doláres você vai comprar? ");
		double dollarTotal = sc.nextDouble();

		System.out.println();
		System.out.printf("Você vai gastar em reais = %.2f ", exer6Classes.reaisDollar(dollar, dollarTotal));


		sc.close();
		
	}

}