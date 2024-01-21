package com.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String itemName;
	
	
	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}
	
	

}
