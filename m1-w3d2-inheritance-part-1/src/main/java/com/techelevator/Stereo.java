package com.techelevator;

public class Stereo extends Product {
	private boolean hasAuxillary;
	private int Height;
	private int presets;
	
	public Stereo(long id, String name, String manufacturer, double weight, double price) {
		super(id, name, manufacturer, weight, price);
		// TODO Auto-generated constructor stub
	}

	public Stereo(long id, String name, boolean isbought) {
		super(id, name, isbought);
		// TODO Auto-generated constructor stub
	}

	public Stereo(long id, String name, String manufacturer, double weight, double price, boolean hasAuxillary,
			int height, int presets) {
		super(id, name, manufacturer, weight, price);
		this.hasAuxillary = hasAuxillary;
		Height = height;
		this.presets = presets;
	}

	public boolean isHasAuxillary() {
		return hasAuxillary;
	}

	public void setHasAuxillary(boolean hasAuxillary) {
		this.hasAuxillary = hasAuxillary;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getPresets() {
		return presets;
	}

	public void setPresets(int presets) {
		this.presets = presets;
	}

}
