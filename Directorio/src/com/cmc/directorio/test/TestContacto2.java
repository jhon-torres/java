package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

import com.cmc.directorio.entidades.AdminContactos;

public class TestContacto2 {

	public static void main(String[] args) {
		Telefono tlf1 = new Telefono("movi", "0944444444",15);
		Telefono tlf2 = new Telefono("claro", "0933333333", 20);
		
		Contacto c1 = new Contacto("Nicole", "Paz", tlf1, 63.20);
		Contacto c2 = new Contacto("Elisa", "Lopez", tlf2, 74.64);
		
		AdminContactos admin = new AdminContactos();
		// si los pesos son iguales retorna 0
		System.out.println("El más pesado es: "+admin.buscarMasPesado(c1, c2));
		
		if (admin.compararOperadoras(c1, c2)) {
			System.out.println("Son de la misma operadora");
		} else {
			System.out.println("Son de diferente operadora");
		}
		

	}

}
