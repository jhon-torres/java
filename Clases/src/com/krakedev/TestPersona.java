package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; // 1. declaro una variable llamada p de tipo Persona
		p = new Persona(); // 2. instanciar el objeto persona, referenciarlo con p

		Persona p2 = new Persona();

		// 3. acceder a los atributos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);

		// 4. Modificar los atributos
		p.nombre = "Jhon";
		p.edad = 25;
		p.estatura = 1.60;

		System.out.println("-------------------------------");
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);

		p2.nombre = "Elisa";
		System.out.println("*****************");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);

	}

}
