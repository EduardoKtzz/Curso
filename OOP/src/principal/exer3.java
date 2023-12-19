package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {

		//SET LOCALIZAÇÂO E ABRINDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PUXANDO CLASSE
		exer3Classes dados = new exer3Classes();

		//PERGUNTAR O NOME DO ALUNO
		System.out.println("Aluno: ");
		dados.name = sc.nextLine();

		//PERGUNTAS AS TRÊS NOTAS DO ANO
		System.out.println();
		System.out.println("Insira suas notas: ");
		dados.nota1 = sc.nextDouble();
		dados.nota2 = sc.nextDouble();
		dados.nota3 = sc.nextDouble();

		//TEXTO COM UMA FUNCTION QUE EXIBE SUA NOTA FINAL
		System.out.printf("Nota final = %.2f%n", dados.notasTotal());
		System.out.println();

		//IF PARA VER SE O ALUNO FOI APROVADO OU NÃO
		if (dados.notasTotal() >= 60) {

			System.out.println("VOCÊ FOI APROVADO");

		} else {

			System.out.println("REPROVADO!");
			System.out.printf("FALTAM %.2f PONTOS PARA PASSAR DE ANO!", dados.notasFaltando());
			System.out.println();
		}

	sc.close();
		
	}
	
}