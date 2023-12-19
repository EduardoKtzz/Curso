package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer2 {
	
	public static void main(String[] args) {
		//SET LOCALIZAÇÂO E ABRINDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PUXANDO CLASSE
		exer2Classes dados = new exer2Classes();

		//PERGUNTAS
		System.out.println("Nome: ");
		dados.name = sc.nextLine();

		System.out.println();
		System.out.println("Salário: ");
		dados.salario = sc.nextDouble();

		System.out.println();
		System.out.println("Impostos: ");
		dados.imposto = sc.nextDouble();

		//CALCULO DE SALARIO LIQUIDO COM UMA FUNCTION
		System.out.println();
		System.out.println("Funcionário: " + dados.name + ", $" + dados.salarioLiquido());

		//CALCULO DE AUMENTO SALARIAL EM PORCENTAGEM
		System.out.println();
		System.out.println("Porcentagem de aumento do salário: ");
		dados.porcentagem = sc.nextDouble();

		double total = dados.incrementarSalario(dados.salario, dados.porcentagem);

		System.out.println();
		System.out.println("Dados atualizados: " + dados.name + ", $" + total);

		sc.close();

	}
}
