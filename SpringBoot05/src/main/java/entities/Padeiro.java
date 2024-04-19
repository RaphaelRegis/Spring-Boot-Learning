package entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Padeiro {

	// atributos
	private String nome;

	//construtor
	public Padeiro(@Value("Peppino") String nome) {
		this.nome = nome;
	}

	//encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//método específico
	public void trabalhar() {
		System.out.println(this.nome+ " esta trabalhando");
		this.nome = "Peppino Rogers";
	}
	
	
}
