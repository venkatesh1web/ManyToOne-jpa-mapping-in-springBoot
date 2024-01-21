package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datajpa.entity.Customer;
import com.datajpa.entity.Item;
import com.datajpa.repository.CustomerRepository;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{
	
	@Autowired
	CustomerRepository customerrepo;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Venkatesh");
		Customer customer1 = new Customer("Sai");
		
		Item item1 = new Item("Mobile");
		Item item2 = new Item("Laptop");
		Item item3 = new Item("Eraphones");
		Item item4 = new Item("Headset");
		Item item5 = new Item("Mouse");
		
		customer.getItems().add(item1);
		customer.getItems().add(item2);
		customer.getItems().add(item3);
		customer1.getItems().add(item4);
		customer1.getItems().add(item5);
		
		
		customerrepo.save(customer);
		customerrepo.save(customer1);
		
		
	}

}
