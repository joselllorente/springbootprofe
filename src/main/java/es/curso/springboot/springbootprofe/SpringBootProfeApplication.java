package es.curso.springboot.springbootprofe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringBootProfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfeApplication.class, args);
	}

}
