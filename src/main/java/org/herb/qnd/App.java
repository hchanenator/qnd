package org.herb.qnd;

import org.herb.qnd.domain.Customer;
import org.herb.qnd.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="org.herb.qnd")
public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class);

	}

	@Bean
	public CommandLineRunner demo(CustomerService service) {
		return (args) -> {
			Customer bauer = new Customer();
			bauer.setName("Bauer");

			Customer hespeler = new Customer();
			hespeler.setName("Hespeler");

			Customer newBauer = new Customer();
			newBauer.setName("Bauer");

			service.save(newBauer);
			service.save(hespeler);
			service.save(bauer);

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : service.findAll()) {
				log.info(customer.toString());
			}
			log.info("-------------------------------");
			
			// fetch only customers with "Bauer"
			log.info("Customers with 'Bauer':");
			log.info("-------------------------------");
			for (Customer customer : service.findByName("Bauer")) {
				log.info(customer.toString());
			}
			log.info("-------------------------------");
		};
	}
}
