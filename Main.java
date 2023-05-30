package com.question1Polymorphism;

interface Shape {
	double calculateArea();

	double calculatePerimeter();
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}

class Triangle implements Shape {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double calculateArea() {
		double semiPerimeter = calculatePerimeter() / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
	}

	@Override
	public double calculatePerimeter() {
		return sideA + sideB + sideC;
	}
}

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle(6.0);
		System.out.println("Area of Circle ::" + circle.calculateArea());
		System.out.println("Perimeter of Circle ::" + circle.calculatePerimeter());

		System.out.println("***********");
		
		Shape triangle = new Triangle(3.0, 4.0, 6.0);
		System.out.println("Area of Triangle :: " + triangle.calculateArea());
		System.out.println("Perimeter of Triangle :: " + triangle.calculatePerimeter());
	}
}
