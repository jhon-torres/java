package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		int resultado;
		
		resultado = calcu.sumar(4, 5);
		System.out.println("resultado: "+resultado);
		
		resultado = calcu.restar(9, 6);
		System.out.println("resultado: "+resultado);
	}

}
