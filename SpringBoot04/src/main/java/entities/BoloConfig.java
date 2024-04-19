package entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoloConfig {
	
	@Bean
	public Bolo bolo() {
		return new Bolo("", 0, new ObjetoParaTeste());
	}

}
