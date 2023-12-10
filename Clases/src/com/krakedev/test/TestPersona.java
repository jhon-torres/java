package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; // 1. declaro una variable llamada p de tipo Persona
		p = new Persona(); // 2. instanciar el objeto persona, referenciarlo con p

		Persona p2 = new Persona();
		Persona p3 = new Persona("Kathe", 27, 1.65);

		// 3. acceder a los atributos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		// 4. Modificar los atributos
		p.setNombre("Jhon");
		p.setEdad(25);
		p.setEstatura(1.60);

		System.out.println("-------------------------------");
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		p2.setNombre("Elisa");
		System.out.println("*****************");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
		System.out.println("p3.nombre: " + p3.getNombre());

	}

}
