package br.com.fiapdelivery.model;

public class Pacote {
	
	private String codigo;
	private double pesoKg;
	
	public Pacote(String codigo, double pesoKg) {
		this.codigo = codigo;
		this.pesoKg = pesoKg;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public double getPesoKg() {
		return this.pesoKg;
	}

}
