package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer1Construtores {
	public static void main(String[] args) {
		
		//SET LOCALIZAÇÂO E ABRINDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PERGUNTAS

		System.out.println("Coloque os dados do produto aqui: ");

		System.out.println("Nome: ");
		String name = sc.nextLine();

		System.out.println("Preço: ");
		double preco = sc.nextDouble();

		System.out.println("Estoque: ");
		int estoque = sc.nextInt();

		//PUXANDO CLASSE
		exer1ConstrutoresClasse produto = new exer1ConstrutoresClasse(name, preco, estoque);


		//PERGUNTAS

		System.out.println();
		System.out.println("Informações do produto: " + produto);

		System.out.println();
		System.out.println("Digite o número de produtos para adcionar em estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);

		System.out.println("Informações atualizadas: " + produto);

		System.out.println();
		System.out.println("Digite o número de produtos a serem retirados de estoque: ");
		int retirados = sc.nextInt();
		produto.removerProdutos(retirados);
		System.out.println("Informações atualizadas: " + produto);

		sc.close();

	}
}
