package ch.course223.extended;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ExtendedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtendedApplication.class, args);
	}

}
