package br.edu.fapi.tanquegasolina;

public class FabricaTanqueGasolina {
	
	public Tanque fabricarTanqueGasolina(double capacidade, double altura, double largura) {
	return new Tanque(capacidade, altura, largura);
	
	}
}
