package com.cmc.repaso.entidades;

public class Validacion {
	// ejercicio 1 valida el monto mayor a 0 retorna un true si se cumple
	public boolean validarMonto(double monto) {
		boolean bool = false;
		if (monto > 0) {
			bool = true;
		}
		return bool;
	}
}
