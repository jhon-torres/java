package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// instanciar 3 objetos en las variables c1, c2 y c3
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		double areaRectangulo;
		double perimetroRectangulo;
		
		// modificar valores 
		c1.lado = 3;
		c2.lado = 4;
		c3.lado = 2;
		
		areaRectangulo = c1.calcularArea();
		System.out.println("Área c1: "+areaRectangulo);
		perimetroRectangulo= c1.calcularPerimetro();
		System.out.println("Perímetro c1: "+perimetroRectangulo);
		
		System.out.println("---------------------");
		areaRectangulo = c2.calcularArea();
		System.out.println("Área c2: "+areaRectangulo);
		perimetroRectangulo= c2.calcularPerimetro();
		System.out.println("Perímetro c2: "+perimetroRectangulo);
		
		System.out.println("---------------------");
		areaRectangulo = c3.calcularArea();
		System.out.println("Área c3: "+areaRectangulo);
		perimetroRectangulo= c3.calcularPerimetro();
		System.out.println("Perímetro c3: "+perimetroRectangulo);

	}

}
