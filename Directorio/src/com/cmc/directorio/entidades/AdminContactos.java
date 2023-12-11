package com.cmc.directorio.entidades;

public class AdminContactos {
	// si los pesos son iguales retorna 0
	public double buscarMasPesado(Contacto c1, Contacto c2) {
		double mp;

		if (c1.getPeso() > c2.getPeso()) {
			mp = c1.getPeso();
		} else if (c1.getPeso() < c2.getPeso()) {
			mp = c2.getPeso();
		} else {
			mp = 0;
		}

		return mp;
	}
	
	// retorna true cuando sean ambos contactos de la misma operadora
	public boolean compararOperadoras (Contacto c1, Contacto c2) {
		boolean op = false;
		
		if (c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora()) {
			op = true;
		}
		
		return op;
	}
	
	public void activarUsuario (Contacto c1) {
		if (c1.isActivo() == false) {
			c1.setActivo(true);
		}
	}
}
