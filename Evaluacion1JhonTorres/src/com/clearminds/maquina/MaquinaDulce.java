package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulce {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulce() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			System.out.println("Celda: " + celdas.get(i).getCodigo());
		}
	}

	public Celda buscarCelda(String codCelda) {
		Celda celdaEncontrada = null;
		Celda elemCelda = null;

		for (int i = 0; i < celdas.size(); i++) {
			elemCelda = celdas.get(i);
			if (codCelda.equals(elemCelda.getCodigo())) {
				celdaEncontrada = elemCelda;
			}
		}

		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codCelda, int cantItems) {
		Celda celdaRecuperada = buscarCelda(codCelda);
		celdaRecuperada.ingresarProducto(producto, cantItems);
	}

	public void mostrarProductos() {
		Celda elemCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elemCelda = celdas.get(i);
			if (elemCelda.getProducto() != null) {
				System.out.println("Celda: " + elemCelda.getCodigo() + " Stock: " + elemCelda.getStock() + " Producto: "
						+ elemCelda.getProducto().getNombre() + " Precio: " + elemCelda.getProducto().getPrecio());
			} else {
				System.out.println("Celda: " + elemCelda.getCodigo() + " Stock: " + elemCelda.getStock()
						+ " Sin Producto asignado"+'\n');
			}
		}
		System.out.println("Saldo: "+saldo);
	}

	public Producto buscarProductoEnCelda(String codCelda) {
		Producto productoEncontrado = null;

		for (int i = 0; i < celdas.size(); i++) {
			if (codCelda.equals(celdas.get(i).getCodigo())) {
				productoEncontrado = celdas.get(i).getProducto();
			}
		}

		return productoEncontrado;
	}

	public double consultarPrecio(String codCelda) {
		double precio = 0;
		for (int i = 0; i < celdas.size(); i++) {
			if (codCelda.equals(celdas.get(i).getCodigo())) {
				precio = celdas.get(i).getProducto().getPrecio();
			}
		}
		return precio;
	}

	public Celda buscarCeldaProducto(String codProducto) {
		Celda celdaEncontrada = null;
		Producto elemProducto;

		for (int i = 0; i < celdas.size(); i++) {
			elemProducto = celdas.get(i).getProducto();
			if (elemProducto != null && codProducto.equals(elemProducto.getCodigo())) {
				celdaEncontrada = celdas.get(i);
			}
		}

		return celdaEncontrada;
	}

	public void incrementarProductos(String codProducto, int cantItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantItems);
	}

	public void vender(String codCelda) {
		Celda celdaEncontrada;

		celdaEncontrada = buscarCelda(codCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += celdaEncontrada.getProducto().getPrecio();
	}
	
	public double venderConCambio (String codCelda, double valorIngresado) {
		Celda celdaRecuperada = buscarCelda(codCelda);
		
		if (celdaRecuperada != null) {
			celdaRecuperada.setStock(celdaRecuperada.getStock() - 1);
			saldo += celdaRecuperada.getProducto().getPrecio();
			return valorIngresado - celdaRecuperada.getProducto().getPrecio();
		}

		return 0;
	}
	
	public ArrayList<Producto> buscarMenores (double limite){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		double precioCelda;
		
		for (int i=0; i<celdas.size(); i++) {
			if (celdas.get(i).getProducto() != null) {
				precioCelda = celdas.get(i).getProducto().getPrecio();
				if (precioCelda<=limite) {
					productos.add(celdas.get(i).getProducto());
				}				
			}
		}
		
		return productos;
	}
}
