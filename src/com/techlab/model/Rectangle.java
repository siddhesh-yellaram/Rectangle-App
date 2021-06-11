package com.techlab.model;

public class Rectangle {
	private final int HUNDRED = 100,ONE = 1;
	private int width, height;
	private String thickness;
	
	public void setWidth(int width) {
		this.width = validateValue(width);
	}
	
	public void setThickness(String thickness) {
		this.thickness = validateData(thickness);
	}
	
	public void setHeight(int height) {
		this.height = validateValue(height);
	}
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getThickness() {
		return thickness;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	private int validateValue(int obj) {
		if(obj > 100) {
			obj = HUNDRED;
		}else if(obj < 0) {
			obj = ONE;
		}
		return obj;
	}
	
	private String validateData(String obj) {
		if(obj != "low" && obj != "high" && obj != "medium") {
			obj = "low";
		}
		return obj;
	}
}
