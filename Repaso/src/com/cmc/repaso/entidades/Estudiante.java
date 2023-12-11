package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiante (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public void calificar (double nota) {
		this.nota = nota;
		
		if (nota >= 8) {
			this.resultado = "A";
		} else {
			this.resultado = "F";
		}
	}
	
	public void mostrarEstudiante () {
		System.out.println("-------------------------");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nota: "+this.nota);
		System.out.println("Resultado: "+this.resultado);
		System.out.println("-------------------------");
		System.out.println();
	}
	
}
