package co.edu.usa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
//scanBasePackages={"co.edu.usa.modelo", "co.edu.usa.servicio", "co.edu.usa.controlador"}
)
public class ProyectoCostumesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCostumesApplication.class, args);
	}

}
