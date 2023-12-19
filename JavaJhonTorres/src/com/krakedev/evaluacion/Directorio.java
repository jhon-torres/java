package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos, correctos, incorrectos;
	private Date fechaModificacion;

	public Directorio() {
		this.contactos = new ArrayList<Contacto>();
		this.correctos = new ArrayList<Contacto>();
		this.incorrectos = new ArrayList<Contacto>();
	}
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}



	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}



	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}



	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}



	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}



	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}



	public boolean agregarContacto(Contacto contacto) {
		boolean cont = false;
		Contacto finded = buscarPorCedula(contacto.getCedula());
		if (contacto != null && finded == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			cont = true;
		}
		return cont;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto cont = null;

		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}

		return cont;
	}

	public String consultarUltimaModificacion() {
		String fecha = null;

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fecha = formato.format(fechaModificacion);

		return fecha;
	}

	public int contarPerdidos() {
		int num = 0;

		for (Contacto cont : contactos) {
			if (cont.getDireccion() == null) {
				num++;
			}
		}

		return num;
	}

	public int contarFijos() {
		int numFijos = 0;
		
		for (Contacto cont : contactos) {
			for (Telefono tlf : cont.getTelefonos()) {
				if (tlf.getNumero().length() == 7 && tlf.getEstado().equals("C")) {
					numFijos++;
				}
			}
		}
		
		return numFijos;
	}
	
	public void depurar () {
		for (Contacto cont : contactos) {
			if (cont.getDireccion()!= null) {
				correctos.add(cont);
			} else {
				incorrectos.add(cont);
			}
		}
		contactos.clear();
	}
}
