package com.krakedev;

public class Calculadora {
	public int sumar (int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public int restar (int valor1, int valor2) {
		return valor1 - valor2;
	}
	
	public double multiplicar (double valor1, double valor2) {		
		return valor1 * valor2;
	}
	
	public double dividir (double valor1, double valor2) {
		return valor1 / valor2;
	}
	
	public double promediar (double valor1, double valor2, double valor3) {
		return (valor1 + valor2 + valor3) / 3;
	}
	
	public void mostrarResultados () {
		System.out.println("Ahorita no joven, salí al almuerzo. Regreso en 15 minutos.");
	}
}
