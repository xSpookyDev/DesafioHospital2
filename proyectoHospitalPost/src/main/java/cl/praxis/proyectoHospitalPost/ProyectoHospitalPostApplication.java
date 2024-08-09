package cl.praxis.proyectoHospitalPost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoHospitalPostApplication {
	private static final Logger logger= LoggerFactory.getLogger(ProyectoHospitalPostApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando gestor de pacientes del hospital");
		SpringApplication.run(ProyectoHospitalPostApplication.class, args);
	}

}
