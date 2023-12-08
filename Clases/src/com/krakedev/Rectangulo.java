package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;

	public int calcularArea() {
		return base * altura;
	}
	
	public double calcularPerimetro () {
		return (base * 2) + (altura * 2);
	}
}
