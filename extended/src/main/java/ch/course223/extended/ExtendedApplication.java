package ch.course223.extended;

import ch.course223.extended.salaryOperations.SalaryOperationSingleResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ExtendedApplication {

	private SalaryOperationSingleResult salaryOperationSingleResult;

	public static void main(String[] args) {
		SpringApplication.run(ExtendedApplication.class, args);

	}

}
