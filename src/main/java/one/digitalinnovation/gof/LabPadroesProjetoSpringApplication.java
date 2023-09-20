package one.digitalinnovation.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *	Projeto Spring Boot gerado via Spring Initializr
 *	Os seguintes starters foram selecionados:
 *	 - Spring Data JPA
 *	 - Spring Web
 *	 - H2 Database
 *	 - OpenFeign
 *
 *	 @Autor loureiro58
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
