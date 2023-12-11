package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	// valida el precio sea positivo, si es negativo lo multiplica por -1
	public void setPrecio(double precio) {
		if (precio < 0) {
			this.precio = precio * -1;
		} else {
			this.precio = precio;
		}
	}

	// método que recibe el porcentaje del descuento y retorna el precio con
	// promoción
	public double calcularPrecioPromo(double descuento) {
		double precioPromo = 0;
		if (descuento > 0) {
			precioPromo = this.precio - (this.precio * descuento / 100);
		}
		return precioPromo;
	}

}
