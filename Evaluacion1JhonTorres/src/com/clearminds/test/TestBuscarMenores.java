package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulce;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulce maquina=new MaquinaDulce();
		ArrayList<Producto> productos;
		
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.50);
		maquina.cargarProducto(producto2, "A1", 6);
		
		Producto producto3=new Producto("KE345","Jet",0.25);
		maquina.cargarProducto(producto3, "C1", 4);

		Producto producto4=new Producto("D4567","DeTodito",0.60);
		maquina.cargarProducto(producto4, "B2", 6);
		
        productos = maquina.buscarMenores(1);
        
        System.out.println("Productos Menores: "+productos.size());
        for (int i=0; i<productos.size(); i++) {
        	System.out.println("Nombre: "+productos.get(i).getNombre()+" Precio: "+productos.get(i).getPrecio());
        }

	}

}
