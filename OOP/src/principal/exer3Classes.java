package principal;

public class exer3Classes {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notasTotal() {
		return nota1 + nota2 + nota3;
	}

	public double notasFaltando() {
		return 60 - notasTotal();
	}

}
