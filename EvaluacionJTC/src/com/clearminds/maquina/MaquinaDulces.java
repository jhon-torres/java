package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("----------CONFIGURACIÓN-----------");
		System.out.println("Código de 1: " + celda1.getCodigo() + '\n' + "Código de 2: " + celda2.getCodigo() + '\n'
				+ "Código de 3: " + celda3.getCodigo() + '\n' + "Código de 4: " + celda4.getCodigo() + '\n' + "Saldo: "
				+ saldo + '\n');
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);

		if (celdaRecuperada != null) {
			celdaRecuperada.setProducto(producto);
			celdaRecuperada.setStock(cantidad);
		}
	}

	public void mostrarProductos() {
		
		System.out.println("----------------------------" + '\n' + "Celda " + celda1.getCodigo() + '\n'
				+ "----------------------------" + '\n' + "Stock inicial: " + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre() + '\n' 
					+ "Precio Producto: " + celda1.getProducto().getPrecio() + '\n'
					+ "Código Producto: " + celda1.getProducto().getCodigo() + '\n');	
			
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		

		System.out.println("----------------------------" + '\n' + "Celda " + celda2.getCodigo() + '\n'
				+ "----------------------------" + '\n' + "Stock inicial: " + celda2.getStock());
		if (celda2.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre() + '\n' 
					+ "Precio Producto: " + celda2.getProducto().getPrecio() + '\n'
					+ "Código Producto: " + celda2.getProducto().getCodigo() + '\n');	
			
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("----------------------------" + '\n' + "Celda " + celda3.getCodigo() + '\n'
				+ "----------------------------" + '\n' + "Stock inicial: " + celda3.getStock());
		if (celda3.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre() + '\n' 
					+ "Precio Producto: " + celda3.getProducto().getPrecio() + '\n'
					+ "Código Producto: " + celda3.getProducto().getCodigo() + '\n');	
			
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("----------------------------" + '\n' + "Celda " + celda4.getCodigo() + '\n'
				+ "----------------------------" + '\n' + "Stock inicial: " + celda4.getStock());
		if (celda4.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre() + '\n' 
					+ "Precio Producto: " + celda4.getProducto().getPrecio() + '\n'
					+ "Código Producto: " + celda4.getProducto().getCodigo() + '\n');	
			
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);

		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto();
		}

		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);

		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto().getPrecio();
		}

		return 0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigoProducto) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigoProducto) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigoProducto) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigoProducto) {
			return celda4;
		}

		return null;
	}

	public void incrementarProductos(String codigoProd, int cantItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProd);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()+cantItems);
		}
	}

	public void vender(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		double precioProducto;

		if (celdaRecuperada != null) {
			celdaRecuperada.setStock(celdaRecuperada.getStock() - 1);
			precioProducto = celdaRecuperada.getProducto().getPrecio();
			saldo += precioProducto;

			//mostrarProductos();
		}
	}

	public double venderConCambio(String codCelda, double valorIngresado) {
		Celda celdaRecuperada = buscarCelda(codCelda);

		if (celdaRecuperada != null) {
			celdaRecuperada.setStock(celdaRecuperada.getStock() - 1);
			saldo += celdaRecuperada.getProducto().getPrecio();
			return valorIngresado - celdaRecuperada.getProducto().getPrecio();
		}

		return 0;
	}
}
