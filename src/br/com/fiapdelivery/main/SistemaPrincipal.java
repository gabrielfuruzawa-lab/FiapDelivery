package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Entrega;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- FIAP DELIVERY ---\n");

        Pacote pacote1 = new Pacote("PKG-999", 2.5);
        Pacote pacote2 = new Pacote("PKG-888", 850.0);
        
        System.out.println("Pacote Registrado: " + pacote1.getCodigo() + " | Peso: " + pacote1.getPesoKg() + "kg");
        System.out.println("Pacote Registrado: " + pacote2.getCodigo() + " | Peso: " + pacote2.getPesoKg() + "kg\n");

        Moto moto1 = new Moto("ABC-1234", 15.0, true);
        Caminhao caminhao1 = new Caminhao("XYZ-9876", 5000.0, 3);

        System.out.println("Veículo: Moto | Placa: " + moto1.getPlaca() + " | Baú: " + moto1.isTemBau()+ " | Capacidade de carga (kg): " + moto1.getCapacidadeCargaKg() + "kg");
        System.out.println("Veículo: Caminhão | Placa: " + caminhao1.getPlaca() + " | Eixos: " + caminhao1.getNumeroEixos() + " | Capacidade de carga (kg): " + caminhao1.getCapacidadeCargaKg() + "kg\n");

        Entrega entregaMoto1 = new Entrega("Av. Paulista, 1106", pacote1, moto1);
        Entrega entregaCaminhao1 = new Entrega("Rodovia Anhanguera, Km 15", pacote2, caminhao1);

        entregaMoto1.realizarEntrega();
        entregaCaminhao1.realizarEntrega();
        
        System.out.println("\nResumo da Entrega 1:");
        System.out.println("Destino: " + entregaMoto1.getDestino() + " | Status: " + entregaMoto1.getStatus() + " | Veículo utilizado: " + entregaMoto1.getVeiculoUtilizado().getPlaca());
        
        System.out.println("\nResumo da Entrega 2:");
        System.out.println("Destino: " + entregaCaminhao1.getDestino() + " | Status: " + entregaCaminhao1.getStatus() + " | Veículo utilizado: " + entregaCaminhao1.getVeiculoUtilizado().getPlaca());
    }
}