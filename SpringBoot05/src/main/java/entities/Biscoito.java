package entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Biscoito {

	// atributos
	private String sabor;
	private double peso;
	private boolean assado;

	// construtor
	public Biscoito(@Value("") String sabor, @Value("0.0") double peso) {
		this.sabor = sabor;
		this.peso = peso;
		this.assado = false;
	}

	// encapsulamento
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
	public boolean isAssado() {
		return assado;
	}

	// método próprio
	public boolean assar() {
		this.assado = true;
		System.out.println("Assado agora");
		return assado;
	}
}
