package com.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
