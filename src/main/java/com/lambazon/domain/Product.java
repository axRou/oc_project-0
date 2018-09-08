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



	public int getQuantity() {
        if (quantity < 0 ) {
            return 0;
        } else {return quantity;}
        /* Add one condition to the quantity of the product: quantity can be >= 0 */
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
        if (price < 0) { return 0.0; }
        else if (price > 1000) { return 1000;}
        else { return price;}
        /* Add two condition to the price of the product: 0 > Price < 1000 */
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public double getInventoryPrice() {
		return getQuantity()*getPrice();
		/*
		Configuration of the method getInventoryPrice wich calculate the total amount of the product in stock
	    UP TO DATE --> multiple the two method for respect the rules <-------------
	    -------------> #############   Quantity >= 0 ################<-------------
	    -------------> ############ 0 >= Price <= 1000 ##############<-- UP TO DATE
	    */
	}
}
