package br.com.fiapdelivery.model;

public class Veiculo {
	
	private String placa;
	private double capacidadeCargaKg;
	
	public Veiculo(String placa, double capacidadeCargaKg) {
		this.setPlaca(placa);
		this.capacidadeCargaKg = capacidadeCargaKg;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public double getCapacidadeCargaKg() {
		return this.capacidadeCargaKg;
	}
	
	private void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
