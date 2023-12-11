package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono tlf1 = new Telefono("movi", "0988776655", 30);
		Telefono tlf2 = new Telefono("claro", "0988776644", 15);
		Telefono tlf3 = new Telefono("movi", "0988773322", 20);

		AdminTelefono admin = new AdminTelefono();
		if (admin.contarMovi(tlf1, tlf2, tlf3) > 1 || admin.contarMovi(tlf1, tlf2, tlf3) == 0) {
			System.out.println("Hay " + admin.contarMovi(tlf1, tlf2, tlf3) + " teléfonos de la Operadora movi");
		} else {
			System.out.println("Hay " + admin.contarMovi(tlf1, tlf2, tlf3) + " teléfono de la Operadora movi");
		}

	}

}
