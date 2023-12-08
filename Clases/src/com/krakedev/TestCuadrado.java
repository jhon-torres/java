package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// instanciar 3 objetos en las variables c1, c2 y c3
		Cuadrado c1 = new Cuadrado(3);
		Cuadrado c2 = new Cuadrado(4);
		Cuadrado c3 = new Cuadrado(2);

		double areaCuadrado;
		double perimetroCuadrado;

		// modificar valores
		/*
		 * c1.setLado(3); c2.setLado(4); c3.setLado(2);
		 */

		areaCuadrado = c1.calcularArea();
		System.out.println("Área c1: " + areaCuadrado);
		perimetroCuadrado = c1.calcularPerimetro();
		System.out.println("Perímetro c1: " + perimetroCuadrado);

		System.out.println("---------------------");
		areaCuadrado = c2.calcularArea();
		System.out.println("Área c2: " + areaCuadrado);
		perimetroCuadrado = c2.calcularPerimetro();
		System.out.println("Perímetro c2: " + perimetroCuadrado);

		System.out.println("---------------------");
		areaCuadrado = c3.calcularArea();
		System.out.println("Área c3: " + areaCuadrado);
		perimetroCuadrado = c3.calcularPerimetro();
		System.out.println("Perímetro c3: " + perimetroCuadrado);

	}

}
