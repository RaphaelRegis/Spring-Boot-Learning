package entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bolo {
	//atributos
	private String sabor;
	private double peso;
	private ObjetoParaTeste opt;

	//construtor
	public Bolo(@Value("") String sabor, @Value("0.0") double peso, ObjetoParaTeste opt) {
		this.sabor = sabor;
		this.peso = peso;
		this.setOpt(opt);
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
	public ObjetoParaTeste getOpt() {
		return opt;
	}
	public void setOpt(ObjetoParaTeste opt) {
		this.opt = opt;
	}
	
	
	//método específico
	public void taBomEsseBolo() {
		System.out.println("Ta uma dilissa");
	}

	
	
}
