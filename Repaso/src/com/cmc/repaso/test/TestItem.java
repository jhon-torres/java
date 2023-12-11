package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();

		item1.setProductosActuales(20);
		item1.imprimir();

		item2.setProductosActuales(30);
		item2.vender(10);
		item2.imprimir();
		item2.devolver(5);
		item2.imprimir();
	}

}
