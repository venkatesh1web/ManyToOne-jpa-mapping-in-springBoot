package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datajpa.entity.Customer;
import com.datajpa.entity.Item;
import com.datajpa.repo.CustomerRepository;

@SpringBootApplication
public class OneToOneUnidirectionalsApplication implements CommandLineRunner {
	
	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirectionalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer("Venkat");
		Item item = new Item("item1");
		
		customer.setItem(item);
		
		customerRepository.save(customer);
		
	}

}
