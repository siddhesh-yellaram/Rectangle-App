package com.techlab.rectangle.test;

import com.techlab.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bigRect = new Rectangle();
		Rectangle smallRect = new Rectangle();
		bigRect.setWidth(12);
		bigRect.setHeight(25);
		bigRect.setThickness("low");
		smallRect.setWidth(11);
		smallRect.setHeight(25);
		smallRect.setThickness("any");
		System.out.println("Big Rectangle: ");
		createRectangle(bigRect);
		System.out.println("Small Rectangle: ");
		createRectangle(smallRect);
	}
	public static void createRectangle(Rectangle obj) {
		System.out.println("Width: "+obj.getWidth());
		System.out.println("Height: "+obj.getHeight());
		System.out.println("Thickness: "+obj.getThickness());
		System.out.println("Total Area: "+obj.calculateArea());
	}
}
