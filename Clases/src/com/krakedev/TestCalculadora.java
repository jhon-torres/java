package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		int resultado;
		double total;
		
		resultado = calcu.sumar(4, 5);
		System.out.println("Resultado suma: "+resultado);
		
		resultado = calcu.restar(9, 6);
		System.out.println("Resultado resta: "+resultado);
		
		total = calcu.multiplicar(10, 5);
		System.out.println("Resultado multiplicación: "+total);
		
		total = calcu.dividir(10, 2);
		System.out.println("Resultado división: "+total);
		
		total = calcu.promediar(10, 8, 9);
		System.out.println("Resultado promediar: "+total);
		
		calcu.mostrarResultados();
	}

}
