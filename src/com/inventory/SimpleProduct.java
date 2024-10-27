package com.inventory;

import java.text.SimpleDateFormat;

public class SimpleProduct implements Product {

	private int id;
	private String name;
	private int quantity;
	private double price;
	private static int simpleProductCount = 0;

	public SimpleProduct(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;

		simpleProductCount++;
		this.id = simpleProductCount;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SimpleProduct{" +
				"id=" + id +
				", name='" + name + '\'' +
				", quantity=" + quantity +
				", price=" + price +
				'}';
	}
}
