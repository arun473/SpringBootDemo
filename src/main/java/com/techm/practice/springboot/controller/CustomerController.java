package com.techm.practice.springboot.controller;

import com.techm.practice.springboot.model.Customer;
import com.techm.practice.springboot.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/")
    public String getStatus() {

        return "Welcome to Spring-Boot";
    }

    @GetMapping("/customers")
    public List<Customer> retrieveAllStudents() {

        List<Customer> list = repository.findAll();
        for(Customer c : list){
            System.out.println(c);
        }
        return list;
    }

    @GetMapping(path="/customer/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public Customer retrieveStudent(@PathVariable long id) {
        List<Customer> cList = repository.findById(id);
        System.out.println(cList.get(0));
        return cList.get(0);
    }

    @GetMapping("/status")
    public String putData() {
        System.out.println("...................... inside put method .......................");
        return "UP";
    }

	/*@Bean
	public CommandLineRunner demo(CustomerRepository repository) {

		// save a couple of customers
		repository.save(new Customer("Jack", "Bauer"));
		repository.save(new Customer("Chloe", "O'Brian"));
		repository.save(new Customer("Kim", "Bauer"));
		repository.save(new Customer("David", "Palmer"));
		repository.save(new Customer("Michelle", "Dessler"));

		repository.save(new Customer("Jack", "Bauer"));

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Customer customer : repository.findAll()) {
			log.info(customer.toString());
		}
		log.info("");

		// fetch an individual customer by ID
		List<Customer> customer = repository.findById(1L);
		if (customer != null) {
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");
		}

		// fetch customers by last name
		log.info("Customer found with findByLastName('Bauer'):");
		log.info("--------------------------------------------");
		List<Customer> customer1 = repository.findByLastName("Bauer");
		if (customer1 != null) {
			for (Customer cus : customer1) {
				log.info(cus.toString());
			}
		}
		// for (Customer bauer : repository.findByLastName("Bauer")) {
		// 	log.info(bauer.toString());
		// }
		log.info("");

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {

			}
		};
	}*/
}
