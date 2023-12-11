package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono tlf1 = new Telefono("movi", "0988776655", 30);
		Telefono tlf2 = new Telefono("claro", "0988776644", 15);
		Telefono tlf3 = new Telefono("movi", "0988773322", 20);
		Telefono tlf4 = new Telefono("movi", "0988774411", 50);
		
		AdminTelefono admin = new AdminTelefono();
		if (admin.contarClaro(tlf1, tlf2, tlf3, tlf4) > 1 || admin.contarClaro(tlf1, tlf2, tlf3, tlf4) == 0) {
			System.out.println("Hay " + admin.contarClaro(tlf1, tlf2, tlf3, tlf4) + " teléfonos de la Operadora claro");
		} else {
			System.out.println("Hay " + admin.contarClaro(tlf1, tlf2, tlf3, tlf4) + " teléfono de la Operadora claro");
		}
		

	}

}
