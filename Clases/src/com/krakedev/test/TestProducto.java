package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// 1. Crear las variables productoA, productoB y productoC
		Producto productoA;
		Producto productoB;
		Producto productoC;

		// 2. Instanciar 3 objetos en las variables productoA, productoB y productoC
		productoA = new Producto("Ibuprofeno 400 mg",
				"Analgésico y antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación.",
				0.60, 110);
		productoB = new Producto("Loratadina 10 mg",
				"Medicamento antihistamínico utilizado para aliviar los síntomas de la alergia, como picazón en los ojos, estornudos, y secreción nasal.",
				0.40, 250);
		productoC = new Producto("Protector solar SPF 30",
				"Crema que proporciona protección ante los rayos UVA y UVB del sol.", 0.50, 300);

		// 3. Modificar los atributos de cada producto
		// producto A
		/*
		 * productoA.setNombre("Ibuprofeno 400 mg"); productoA.
		 * setDescripcion("Analgésico y antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación."
		 * ); productoA.setPrecio(0.60); productoA.setStockActual(110);
		 */
		// producto B
		/*
		 * productoB.setNombre("Loratadina 10 mg"); productoB.
		 * setDescripcion("Medicamento antihistamínico utilizado para aliviar los síntomas de la alergia, como picazón en los ojos, estornudos, y secreción nasal."
		 * ); productoB.setPrecio(0.40); productoB.setStockActual(250);
		 */
		// producto C
		/*
		 * productoC.setNombre("Protector solar SPF 30"); productoC.
		 * setDescripcion("Crema que proporciona protección ante los rayos UVA y UVB del sol."
		 * ); productoC.setPrecio(0.40); productoC.setStockActual(250);
		 */

		// 4. Mostrar los valores de los atributos de cada objeto
		System.out.println("-----------Producto A-----------");
		productoA.mostrarAtributosP();
		System.out.println("-----------Producto B-----------");
		productoB.mostrarAtributosP();
		System.out.println("-----------Producto C-----------");
		productoC.mostrarAtributosP();

	}

}
