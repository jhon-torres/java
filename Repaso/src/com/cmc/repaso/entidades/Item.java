package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("---------PRODUCTO---------");
		//System.out.println("Nombre: "+this.nombre);
		System.out.println("Actuales: "+this.productosActuales);
		System.out.println("Devueltos: "+this.productosDevueltos);
		System.out.println("Vendidos: "+this.productosVendidos);
		System.out.println("--------------------------");
		System.out.println();
	}
	
	public void vender (int productosVendidos) {
		if (productosVendidos > 0 ) {
			this.productosActuales -= productosVendidos;
			this.productosVendidos += productosVendidos;
		}
	}
	
	public void devolver (int productos) {
		if (productos > 0) {
			this.productosActuales += productos;
			this.productosDevueltos += productos;
			this.productosVendidos -= productos;
		}
	}
}
