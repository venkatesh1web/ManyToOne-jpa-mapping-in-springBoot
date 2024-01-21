package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datajpa.entity.Customer;
import com.datajpa.entity.Item;
import com.datajpa.repository.CustomerRepository;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner{
	
	@Autowired
	CustomerRepository customerrepo;

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Venkatesh");
		
		Item item1 = new Item("Mobile");
		Item item2 = new Item("Laptop");
		Item item3 = new Item("Earphone");
		
		customer.getItems().add(item1);
		customer.getItems().add(item2);
		customer.getItems().add(item3);
		
		item1.setCustomer(customer);
		item2.setCustomer(customer);
		item3.setCustomer(customer);
		
		customerrepo.save(customer);
		
	}

}
