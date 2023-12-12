package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		this.estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		String mensaje = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			if (estudiante != null && estudiantes.get(i).getCedula().equals(estudiante.getCedula())) {
				return mensaje = "Estudiante encontrado en curso";
			}
		}
		return mensaje;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		String mensajeR = buscarEstudiantePorCedula(estudiante);

		if (mensajeR == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double suma = 0;

		for (int i = 0; i < estudiantes.size(); i++) {
			suma += estudiantes.get(i).calcularPromedioNotasEstudiante();
		}

		return suma / estudiantes.size();
	}

	public void mostrar() {
		String listaEstudiantes = "";
		for (int i = 0; i < estudiantes.size(); i++) {
			if (i != estudiantes.size() - 1) {
				listaEstudiantes += estudiantes.get(i).getNombre() + " " + estudiantes.get(i).getApellido() + ", ";
			} else {
				listaEstudiantes += estudiantes.get(i).getNombre() + " " + estudiantes.get(i).getApellido();
			}
		}
		System.out.println("Curso [ " + listaEstudiantes + " ]");
	}
}
