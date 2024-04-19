package entities.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import entities.Padeiro;
import entities.Torta;

@Component
@Aspect
public class LoggingAspect {

	// logging do Bolo
	@Before("execution(void entities.Bolo.assar())")
	public void antesAssarBolo() {
		System.out.println("Bolo colocado para assar");
	}

	@After("execution(void entities.Bolo.assar())")
	public void depoisAssarBolo() {
		System.out.println("Bolo terminou de assar");
	}

	// logging do Pão
	@Before("execution(void entities.Pao.assar(String))")
	public void antesAssarPao(JoinPoint jp) {
		Object[] args = jp.getArgs();
		System.out.println("Pao colocado para assar - Tempo esperado: " + args[0] + " min");
	}

	@After("execution(void entities.Pao.assar(String))")
	public void depoisAssarPao(JoinPoint jp) {
		Object[] args = jp.getArgs();
		System.out.println("Pao terminou de assar - Tempo esperado: " + args[0] + " min");
	}

	// logging do Biscoito
	@Before("execution(boolean entities.Biscoito.assar())")
	public void antesAssarBiscoito() {
		System.out.println("Biscoito colocado para assar");
	}

	@AfterReturning(pointcut = "execution(boolean entities.Biscoito.assar())", returning = "resultado")
	public void depoisAssarBiscoito(boolean resultado) {
		System.out.println("Biscoito assado: " + resultado);
	}

	// logging da Torta
	@Before("execution(void entities.Torta.assar())")
	public void antesAssarTorta(JoinPoint jp) {
		Torta torta = (Torta) jp.getTarget();
		System.out.println("Torta assada: " +torta.isAssada());
	}

	@After("execution(void entities.Torta.assar())")
	public void depoisAssarTorta(JoinPoint jp) {
		Torta torta = (Torta) jp.getTarget();
		System.out.println("Torta assada: " +torta.isAssada());
	}

	//logging do Padeiro
	@Around("execution(void entities.Padeiro.trabalhar())")
	public void verificarExpediente(ProceedingJoinPoint pjp) throws Throwable {
		Padeiro padeiro = (Padeiro) pjp.getTarget();
		
		System.out.println(padeiro.getNome()+ " chegou ao trabalho");
		pjp.proceed();
		System.out.println(padeiro.getNome()+ " saiu do trabalho");
		
	}

}
