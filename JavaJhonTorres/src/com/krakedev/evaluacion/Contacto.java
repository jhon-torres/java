package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula, nombre, apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<Telefono>();
	}
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<Telefono>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void imprimir() {
		// IMPRIMIR 1
		/*
		 * System.out.println("Información del Contacto:");
		 * System.out.println("Cédula: "+cedula); System.out.println("Nombre: "+nombre);
		 * System.out.println("Apellido: "+apellido); System.out.println("Dirección:");
		 * if (direccion != null) {
		 * System.out.println("   Calle Principal: "+direccion.getCallePrincipal());
		 * System.out.println("   Calle Secundaria: "+direccion.getCalleSecundaria()); }
		 */
		
		// IMPRIMIR 2
		System.out.println("***"+nombre+" "+apellido+"****");
		if (direccion != null) {
			System.out.println("Dirección: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());			
		} else {
			System.out.println("No tiene asociada una dirección");
		}
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos () {
		System.out.println("Teléfonos con estado 'C'");
		for (Telefono tlf : telefonos) {
			if (tlf.getEstado().equals("C")) {
				System.out.println("Número: "+tlf.getNumero()+", Tipo: "+tlf.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos (){
		ArrayList<Telefono> array = new ArrayList<Telefono>();
		for (Telefono tlf : telefonos) {
			if (tlf.getEstado().equals("E")) {
				array.add(tlf);
			}
		}
		
		return array;
	}
}
