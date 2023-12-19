package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {

		//SET LOCALIZAÇÂO E ABRINDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PUXANDO CLASSE
		exer5Classes x, y;
		x = new exer5Classes();
		y = new exer5Classes();

		//PERGUNTAS
		System.out.println("Digite a áreaX do seu triângulo: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite a áreaY do seu triângulo: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		//FUNCTION PARA CALCULAR AREA

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triângulo X: %.4f%n", areaX);
		System.out.printf("Triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Sua maior área é a: Área X");
		} else {
			System.out.println("Sua maior área é a: Área Y");
		}

		sc.close();






	}
}
