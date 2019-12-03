package sg.edu.nus;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sa49demoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(Sa49demoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Sa49demoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
			log.info("Hello SA");
			//List<Employee> elist =(ArrayList<Employee>)repository.findAll();
			for (Employee currentEmployee : repository.findAll()) {
				log.info(currentEmployee.toString());
			}
			log.info("Code ends");
		};

	}
}
