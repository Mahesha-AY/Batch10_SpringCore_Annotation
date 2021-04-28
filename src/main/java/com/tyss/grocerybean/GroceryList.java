package com.tyss.grocerybean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class GroceryList {

	@Id
	@Column
	private int gid;

	@Column
	private String name;
	
	@Column
	private int price;

}
