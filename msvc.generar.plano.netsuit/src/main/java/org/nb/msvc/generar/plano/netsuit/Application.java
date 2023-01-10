package org.nb.msvc.generar.plano.netsuit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		try {
			logger.info("Inicia Proceso de generar archivo plano de NetSuit");
		}
		catch(Exception e) {
			logger.error("Inicia Proceso de generar archivo plano de NetSuit");
		}
	}

}
