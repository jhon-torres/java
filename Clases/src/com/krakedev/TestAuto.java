package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// 1. Instanciar 2 objetos de la clase Auto en las variables auto1 y auto2
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		// Modificar los valores de los atributos de cada auto
		// Auto 1
		auto1.marca = "Mercedes";
		auto1.anio = 2014;
		auto1.precio = 49999.00;
		// Auto 2
		auto2.marca = "Toyota";
		auto2.anio = 2017;
		auto2.precio = 34999.00;
		
		// Mostrar los valorres de los atributos 
		System.out.println("-------Auto 1---------");
		auto1.mostrarAtributos(); // mediante metodo
		/*
		 * System.out.println("Marca: "+auto1.marca);
		 * System.out.println("Año: "+auto1.anio);
		 * System.out.println("Precio: "+auto1.precio);
		 */
		
		System.out.println("-------Auto 2---------");
		auto2.mostrarAtributos();
		/*
		* System.out.println("Marca: "+auto2.marca);
		* System.out.println("Año: "+auto2.anio);
		* System.out.println("Precio: "+auto2.precio);
		*/

	}

}
