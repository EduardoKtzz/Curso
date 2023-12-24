package principal;

public class exerEncapsulamentoClass {

	//ENCAPSULAMENTO

	private String name;
	private double preco;
	private int estoque;


	//CONSTRUTORES

	public exerEncapsulamentoClass() {

	}

	public exerEncapsulamentoClass(String name, double preco, int estoque) {
		this.name = name;
		this.preco = preco;
		this.estoque = estoque;

	}

	public exerEncapsulamentoClass(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}

	//ENCAPSULAMENTO

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public int getEstoque() {
		return estoque;
	}



	public double valorTotalEstoque() {
		return preco * estoque;
	}

	public void adicionarProdutos(int estoque) {
		this.estoque += estoque;

	}

	public void removerProdutos(int estoque) {
		this.estoque -= estoque;
	}

	public String toString() {
		return name 
		+ ", $ "
		+ String.format("%.2f", preco)
		+ ", "
		+ estoque
		+ "unidades. Total: "
		+ String.format("%.2f", valorTotalEstoque());

	}
}