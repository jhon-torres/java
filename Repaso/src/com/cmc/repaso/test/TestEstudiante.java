package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Nicole");
		Estudiante est2 = new Estudiante("Kathe");
		
		System.out.println("******Datos anteriores");
		est1.mostrarEstudiante();
		est2.mostrarEstudiante();
		
		System.out.println("******Datos nuevos");
		est1.calificar(6.75);
		est2.calificar(8);
		
		est1.mostrarEstudiante();
		est2.mostrarEstudiante();
	}

}
