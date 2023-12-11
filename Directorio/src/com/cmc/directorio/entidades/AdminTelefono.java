package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono tlf) {
		if (tlf != null && tlf.getOperadora() == "movi") {
			tlf.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono tlf1, Telefono tlf2, Telefono tlf3) {
		int contador = 0;
		
		if (tlf1.getOperadora() == "movi") {
			contador += 1;
		}
		
		if (tlf2.getOperadora() == "movi") {
			contador += 1;
		}
		
		if (tlf3.getOperadora() == "movi") {
			contador += 1;
		}
		
		return contador;
	}
	
	public int contarClaro(Telefono tlf1, Telefono tlf2, Telefono tlf3, Telefono tlf4) {
		int contador = 0;
		
		if (tlf1.getOperadora() == "claro") {
			contador += 1;
		}
		
		if (tlf2.getOperadora() == "claro") {
			contador += 1;
		}
		
		if (tlf3.getOperadora() == "claro") {
			contador += 1;
		}
		
		if (tlf4.getOperadora() == "claro") {
			contador += 1;
		}
		
		return contador;
	}
}
