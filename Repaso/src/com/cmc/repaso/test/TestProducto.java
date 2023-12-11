package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Smart TV", 350);

		p1.setPrecio(-355);
		//p1.setPrecio(200);

		//
		System.out.println("Precio con promoción de 10% de descuento: " + p1.calcularPrecioPromo(10));
		;
	}

}
