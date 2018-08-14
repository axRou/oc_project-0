package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

    /**
     *Add one condition to the quantity of the product: quantity can be >= 0
     */

	public int getQuantity() {
        if (quantity < 0 ) {
            return 0;
        } else {return quantity;}

	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    /**
     *Add two condition to the price of the product: 0 > Price < 1000
     */

	public double getPrice() {
        if (price < 0) { return 0.0; }
        else if (price > 1000) { return 1000;}
        else { return price;}
	}

	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * Configuration of the method getInventoryPrice wich calculate the total amount of the product in stock
	 */

	public double getInventoryPrice() {
		return quantity*price;
	}
}
