package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int areaRectangulo;
		double perimetroRectangulo;
		
		r1.base = 10;
		r1.altura = 5;
		
		r2.base = 8;
		r2.altura = 3;
		
		areaRectangulo = r1.calcularArea();
		System.out.println("Área r1: "+areaRectangulo);
		perimetroRectangulo= r1.calcularPerimetro();
		System.out.println("Perímetro r1: "+perimetroRectangulo);
		
		System.out.println("---------------------");
		areaRectangulo = r2.calcularArea();
		System.out.println("Área r2: "+areaRectangulo);
		perimetroRectangulo= r2.calcularPerimetro();
		System.out.println("Perímetro r2: "+perimetroRectangulo);
	}

}
