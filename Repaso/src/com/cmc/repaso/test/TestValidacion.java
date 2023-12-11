package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// Ejercicio 1
		Validacion valid = new Validacion();
		System.out.println(valid.validarMonto(0));
		System.out.println(valid.validarMonto(10));
	}

}
