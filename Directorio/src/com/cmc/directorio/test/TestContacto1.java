package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("movi", "0955555555",30);
		Contacto c = new Contacto("Alfredo", "Rojo", telef, 60.15);
		
		System.out.println("----------INFO CONTACTO-----------");
		System.out.println("Nombre: "+c.getNombre()+" "+c.getApellido());
		System.out.println("Activo: "+c.isActivo());
		System.out.println("Peso: "+c.getPeso());
		System.out.println("Info Tlf:");
		System.out.println("    - Operadora: "+c.getTelefono().getOperadora());
		System.out.println("    - Número: "+c.getTelefono().getNumero());
		System.out.println("----------------------------------");
		
		// Ejercicio 3
		
		Telefono tlf1 = new Telefono("movi", "0944444444",15);
		Telefono tlf2 = new Telefono("movi", "0933333333", 20);
		
		Contacto c1 = new Contacto("Nicole", "Paz", tlf1, 23.20);
		Contacto c2 = new Contacto("Elisa", "Lopez", tlf2, 56.64);
		
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
