package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Nota>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		boolean materiaEncontrada = false;
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i).getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
				materiaEncontrada = true;
			}
		}
		if (!materiaEncontrada && nuevaNota != null && nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			notas.add(nuevaNota);
		}
	}

	public void modificarNota(String codMateria, double nuevaNota) {
		Materia elemMateria;
		for (int i = 0; i < notas.size(); i++) {
			elemMateria = notas.get(i).getMateria();
			if (elemMateria != null && elemMateria.getCodigo().equals(codMateria)) {
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					notas.get(i).setCalificacion(nuevaNota);
				}
				break;
			} else {
				System.out.println("NO SE ENCONTRÓ LA MATERIA");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double suma = 0;

		for (int i = 0; i < notas.size(); i++) {
			suma += notas.get(i).getCalificacion();
		}

		return suma / notas.size();
	}

	public void mostrar() {
		String listaNotas = "";
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i).getMateria() != null) {
				if (i != notas.size() - 1) {
					listaNotas += notas.get(i).getMateria().getNombre() + "=" + notas.get(i).getCalificacion() + ", ";
				} else {
					listaNotas += notas.get(i).getMateria().getNombre() + "=" + notas.get(i).getCalificacion();
				}
			}
		}
		System.out.println("Estudiante [ Nombre=" + nombre + ", Apellido=" + apellido + ", Cédula=" + cedula
				+ ", Notas={ " + listaNotas + " } ]");
	}
}
