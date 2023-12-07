package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// 1. Crear las variables productoA, productoB y productoC
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		// 2. Instanciar 3 objetos en las variables productoA, productoB y productoC
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		// 3. Modificar los atributos de cada producto
		// producto A
		productoA.nombre = "Ibuprofeno 400 mg";
		productoA.descripcion = "Analgésico y antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación.";
		productoA.precio = 0.60;
		productoA.stockActual = 110;
		// producto B
		productoB.nombre = "Loratadina 10 mg";
		productoB.descripcion = "Medicamento antihistamínico utilizado para aliviar los síntomas de la alergia, como picazón en los ojos, estornudos, y secreción nasal.";
		productoB.precio = 0.40;
		productoB.stockActual = 250;
		// producto C
		productoC.nombre = "Protector solar SPF 30";
		productoC.descripcion = "Crema que proporciona protección ante los rayos UVA y UVB del sol.";
		productoC.precio = 0.40;
		productoC.stockActual = 250;
		
		// 4. Mostrar los valores de los atributos de cada objeto
		System.out.println("-----------Producto A-----------");
		productoA.mostrarAtributosP();
		System.out.println("-----------Producto B-----------");
		productoB.mostrarAtributosP();
		System.out.println("-----------Producto C-----------");
		productoC.mostrarAtributosP();

	}

}
