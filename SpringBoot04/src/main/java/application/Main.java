package application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entities.Bolo;
import entities.BoloConfig;

public class Main {

	public static void main(String[] args) {

		// definição dos Beans a partir da notação @Configuration COM o arquivo xml
		ConfigurableApplicationContext contexto = new AnnotationConfigApplicationContext(BoloConfig.class);

		Bolo bolo = contexto.getBean(Bolo.class);
		System.out.println(bolo.getSabor());
		System.out.println(bolo.getPeso());
		bolo.taBomEsseBolo();
		bolo.getOpt().testar();
		
		contexto.close();
	}

}
