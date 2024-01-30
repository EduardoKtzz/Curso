package principal;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		//CONFIGURAÇÔES INICIAIS 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//CRIANDO UM ARRAY
		int n = sc.nextInt();
		double[] vetor = new double[n];

		//POSIÇÔES DO ARRAY
		for (int i=0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		}

		//PROCESSO PARA PEGAR A MEDIA DOS NUMEROS DO ARRAY
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}

		//CALCULO DA MEDIA E RESULTADO FINAL
		double media = soma / n;
		System.out.printf("PESO MÉDIO FINAL: %.2f%n ", media);

		sc.close();
	}
	
}
