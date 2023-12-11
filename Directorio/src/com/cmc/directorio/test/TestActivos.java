package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "0955555555",30);
		Contacto contacto = new Contacto("Alfredo", "Rojo", telef, 60.15);

		System.out.println("----------INFO CONTACTO-----------");
		System.out.println("Nombre: "+contacto.getNombre()+" "+contacto.getApellido());
		System.out.println("Activo: "+contacto.isActivo());
		System.out.println("Peso: "+contacto.getPeso());
		System.out.println("Info Tlf:");
		System.out.println("    - Operadora: "+contacto.getTelefono().getOperadora());
		System.out.println("    - Número: "+contacto.getTelefono().getNumero());
		System.out.println("----------------------------------");
		
		AdminContactos admin = new AdminContactos();
		admin.activarUsuario(contacto);
		System.out.println();
		System.out.println("----------INFO CONTACTO-----------");
		System.out.println("Nombre: "+contacto.getNombre()+" "+contacto.getApellido());
		System.out.println("Activo: "+contacto.isActivo());
		System.out.println("Peso: "+contacto.getPeso());
		System.out.println("Info Tlf:");
		System.out.println("    - Operadora: "+contacto.getTelefono().getOperadora());
		System.out.println("    - Número: "+contacto.getTelefono().getNumero());
		System.out.println("----------------------------------");
		
		
	}

}
