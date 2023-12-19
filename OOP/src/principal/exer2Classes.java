package principal;

public class exer2Classes {
	
	public String name;
	public double salario;
	public double imposto;
	public double porcentagem;

	public double salarioLiquido() {
		return salario - imposto;
	}

	public double incrementarSalario(double salario, double porcentagem) {
		return this.salario + (this.salario * this.porcentagem / 100);
	}


}
