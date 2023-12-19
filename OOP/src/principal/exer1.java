

package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {

		//SET LOCALIZAÇÂO E ABRINDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PUXANDO CLASSE
		exer1Classes dados = new exer1Classes();

		//PERGUNTAS
		System.out.println("Insira os dados do retângulo: ");

		dados.altura = sc.nextDouble();
		dados.largura = sc.nextDouble();

		double area = dados.area();
		System.out.printf("AREA = %.2f%n", area);

		double perimetro = dados.perimetro();
		System.out.printf("PERIMETRO = %.2f%n", perimetro);

		double diagonal = dados.diagonal();
		System.out.printf("DIAGONAL = %.2f%n", diagonal);

		sc.close();

	}
}
