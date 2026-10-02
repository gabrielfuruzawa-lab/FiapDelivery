package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
	
	private int numeroEixos;
	
	public Caminhao(String placa, double capacidadeCargaKg, int numeroEixos) {
		super(placa, capacidadeCargaKg);
		this.numeroEixos = numeroEixos;
	}
	
	public int getNumeroEixos(){
		return this.numeroEixos;
	}
	
}
