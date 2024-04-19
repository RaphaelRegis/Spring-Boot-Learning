package application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Biscoito;
import entities.Bolo;
import entities.Padeiro;
import entities.Pao;
import entities.Torta;

public class Main {

	public static void main(String[] args) {

		//inicialição do contexto
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//AOP para bean genérico, sem preocupação com nada
		Bolo bolo = context.getBean(Bolo.class);
		bolo.assar();
		
		//AOP para conselho envolvendo argumentos
		Pao pao = context.getBean(Pao.class);
		System.out.print("\n");
		pao.assar("20");
		
		//AOP para conselho envolvendo retorno
		Biscoito biscoito = context.getBean(Biscoito.class);
		System.out.print("\n");
		biscoito.assar();
		
		//AOP para conselho que utiliza dados do objeto, como atributos
		Torta torta = context.getBean(Torta.class);
		System.out.print("\n");
		torta.assar();
		
		//uso do @Around no AOP
		Padeiro padeiro = context.getBean(Padeiro.class);
		System.out.print("\n");
		padeiro.trabalhar();
		
		//fechamento do contexto
		context.close();

	}

}
