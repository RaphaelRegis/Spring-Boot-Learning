package application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Bolo;

public class Main {

	public static void main(String[] args) {
		
		//definição dos beans a partir de xml em resources
		ConfigurableApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		
		Bolo bolo = contexto.getBean(Bolo.class);
		System.out.println(bolo.getSabor());
		System.out.println(bolo.getPeso());
		
		bolo.taBomEsseBolo();
		
		contexto.close();
		

	}

}
