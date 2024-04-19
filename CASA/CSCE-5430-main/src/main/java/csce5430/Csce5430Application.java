package csce5430;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EntityScan("csce5350.model")
public class Csce5430Application {

	public static void main(String[] args) {
		SpringApplication.run(Csce5430Application.class, args);
	}

}
