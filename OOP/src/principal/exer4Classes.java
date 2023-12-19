package principal;

public class exer4Classes {
	
	public String name;
	public double preco;
	public int estoque;

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
