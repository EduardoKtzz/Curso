package principal;

import java.util.Locale;
import java.util.Scanner;

public class vetoresReferencial {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//CRIAÇÂO DO ARRAY E CHAMANDO CLASSE
		int numero = sc.nextInt();
		vatoresClasses[] produtos = new vatoresClasses[numero];

		//ESTRUTURA FOR
		for (int i=0; i<produtos.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produtos[i] = new vatoresClasses(nome, preco);
		}

		//FAZENDO A MEDIA DOS PREÇOS
		double soma = 0.0;
		for(int i=0; i<produtos.length; i++) {
			soma += produtos[i].getPreco();

		}

		double media = soma/produtos.length;
		System.out.printf("PREÇO MÉDIO FINAL: %.2f%n ", media);



		





		sc.close();
	}
}
