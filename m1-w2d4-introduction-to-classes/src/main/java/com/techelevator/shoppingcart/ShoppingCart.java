package com.techelevator.shoppingcart;

/**
 * This class represents a shopping cart that you can add different priced items to.  
 */


public class ShoppingCart {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	private double totalCost = 0;
	private int numberItems = 0;

	public ShoppingCart() {

	}

	private int getNumberItems() {
		return numberItems;
	}

	private void setNumberItems(int numberItems) {
		this.numberItems = numberItems;
	}

	
	/**
	 * Adds items to the cart.
	 * 
	 * @param numberOfItems the number of items being added to the cart
	 * @param pricePerItem the price per item being added to the cart
	 */
	public void addItems(int numberOfItems, double pricePerItem) {
		this.numberItems += numberOfItems;
		this.totalCost += numberOfItems * pricePerItem;
	}
	
	/**
	 * @return the total number of items that have been added to this cart
	 */
	public int getTotalNumberOfItems() {
		return numberItems;
	}
	
	/**
	 * @return the total price of all items that have been added to the cart
	 */
	public double getTotalAmountOwed() {
		return  this.totalCost;
	}
	
	/**
	 * The average price of all items that have been added to the cart.  This should be equal to 
	 * the totalAmountOwed divided by the totalNumberOfItems.
	 */
	public double getAveragePricePerItem() {
		if (this.numberItems == 0) {
			return 0;
		}
		return this.totalCost / this.numberItems;
	}

	/**
	 * Removes all items from this cart.
	 */
	public void empty() {
		this.totalCost = 0;
		this.numberItems = 0;
	
	}
}
