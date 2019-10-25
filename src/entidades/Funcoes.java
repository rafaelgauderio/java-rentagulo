package entidades;

public class Funcoes {
	private Double ladoA;
	private Double ladoB;

	// construtores

	public Funcoes() {
	}

	public Funcoes(Double ladoA, Double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;

	}

	// Getters and Setters

	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	// métodos

	public double perimetroRentagulo() {
		double perimetro = ladoA + ladoB;
		return perimetro;
	}

	public double areaRetangulo() {
		double area = ladoA * ladoB;
		return area;

	}



	@Override
	public String toString() {
		return "Os valores do lados inforamados foram, respectivamente: "
				+ String.format("%.2f",getLadoA())
				+" e " 
				+ String.format("%.2f",getLadoB())
				+ "\nO valor da perímetro é: " + String.format("%.2f m", perimetroRentagulo())
				+ "\nO valor da Área é: " + String.format("%.2f m²",areaRetangulo());
	}

}
