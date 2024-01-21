package com.datajpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemtable")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ItemId;
	
	@Column
	private String ItemName;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "item")
	private Customer customer;
	
	
	public Item(String itemName) {
		super();
		ItemName = itemName;
	}
	
	

}
