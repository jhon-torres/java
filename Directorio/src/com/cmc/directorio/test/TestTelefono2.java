package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "098234234", 20);
		AdminTelefono admin = new AdminTelefono();
		
		admin.activarMensajeria(telf);
		telf.imprimirTlf();
	}

}
