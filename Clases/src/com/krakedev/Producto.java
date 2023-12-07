package com.krakedev;

public class Producto {
	public String nombre;
	public String descripcion;
	public double precio;
	public int stockActual;
	
	// metodo de la clase Productos
	public void mostrarAtributosP() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Descripción: "+ this.descripcion);
		System.out.println("Precio: "+ this.precio);
		System.out.println("Stock: "+ this.stockActual);
	}
}
