package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		
		//SET LOCALIZAÇÂO E ABRINDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PUXANDO CLASSE
		exer4Classes dados = new exer4Classes();

		//PERGUNTAS

		System.out.println("Coloque os dados do produto aqui: ");

		System.out.println("Nome: ");
		dados.name = sc.nextLine();

		System.out.println("Preço: ");
		dados.preco = sc.nextDouble();

		System.out.println("Estoque: ");
		dados.estoque = sc.nextInt();
		
		System.out.println();
		System.out.println("Informações do produto: " + dados);

		System.out.println();
		System.out.println("Digite o número de produtos para adcionar em estoque: ");
		int quantidade = sc.nextInt();
		dados.adicionarProdutos(quantidade);

		System.out.println("Informações atualizadas: " + dados);

		System.out.println();
		System.out.println("Digite o número de produtos a serem retirados de estoque: ");
		int retirados = sc.nextInt();
		dados.removerProdutos(retirados);
		System.out.println("Informações atualizadas: " + dados);

		sc.close();

	}
}
