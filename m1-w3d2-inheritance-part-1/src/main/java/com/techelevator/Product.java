package com.techelevator;


	public class Product {
		  private final long id;
		  private final String name;

		private String manufacturer;
		private double weight;
		private double price;
		private double stockQuantity;
		private boolean isBought;
		 

		  public Product(long id, String name,  String manufacturer, double weight, double price) {
			
			this.id = id;   // Part Number and key
			this.name = name;
			this.manufacturer = manufacturer;
			this.setWeight(weight);
			this.setPrice(price);
			this.getStockQuantity();
		}



		public Product(long id, String name, boolean isbought) {
		    this.id = id;
		    this.name = name;
		    this.setPrice(10.00);
			this.setWeight(5.00);
			this.isBought = isBought;
		    
		  }

		 

		public long getId() {
			return id;
		}


		public String getName() {
			return name;
		}



		public String getManufacturer() {
			return manufacturer;
		}

		public void setStockQuantity(double quantity)
		{
			stockQuantity = quantity;
		}

		public double getStockQuantity()
		{
			return stockQuantity;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		public void markBought() {
			this.isBought = true;
		}

		public void markNotBought() {
			this.isBought = false;
		}
		public boolean isBought() {
			return isBought;
		}
		
}
