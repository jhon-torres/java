package com.krakedev;

public class Cuadrado {
	public int lado;
	
	public double calcularArea () {
		return Math.pow(lado, 2);
	}
	
	public double calcularPerimetro () {
		return lado * 4;
	}
}
