package com.inventory;

public class SimpleProduct implements Product {
	@Override
	public int getId() {
		return 0;
	}

	@Override
	public String getName() {
		return "";
	}

	@Override
	public int getQuantity() {
		return 0;
	}

	@Override
	public double getPrice() {
		return 0;
	}
}
