package entities;

public class Bolo {
	//atributos
	private String sabor;
	private double peso;
	
	//construtor
	public Bolo(String sabor, double peso) {
		this.sabor = sabor;
		this.peso = peso;
	}

	//encapsulamento
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	//método específico
	public void taBomEsseBolo() {
		System.out.println("Ta uma dilissa");
	}
}
