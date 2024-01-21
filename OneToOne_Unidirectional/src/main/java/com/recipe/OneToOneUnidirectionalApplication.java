package com.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dataJpa.entity.Customer;
import com.dataJpa.entity.Item;
import com.jpa.repo.CustomerRepository;

@SpringBootApplication
public class OneToOneUnidirectionalApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer("Venkat");
		
		Item item = new Item("Mobile");
		
		customer.setItem(item);
	}

}
