package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}

	public Telefono(String operadora, String numero, int codigo) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.tieneWhatsapp = false;
	}

	public void imprimirTlf() {
		System.out.println("-------------------------");
		System.out.println("Operadora: " + this.operadora);
		System.out.println("Número: " + this.numero);
		System.out.println("Código: " + this.codigo);
		if (this.tieneWhatsapp) {
			System.out.println("Tiene Wtp: Sí");
		} else {
			System.out.println("Tiene Wtp: No");
		}
		System.out.println("-------------------------");
		System.out.println();
	}

}
