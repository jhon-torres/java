package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea () {
		return Math.pow(lado, 2);
	}
	
	public double calcularPerimetro () {
		return lado * 4;
	}
}
