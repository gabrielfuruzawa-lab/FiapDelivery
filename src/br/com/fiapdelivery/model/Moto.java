package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
	
	private boolean temBau;
	
	public Moto(String placa, double capacidadeCargaKg, boolean temBau) {
		super(placa, capacidadeCargaKg);
		this.temBau = temBau;
	}
	
	public boolean isTemBau() {
		return this.temBau;
	}
	
}
