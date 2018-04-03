package br.edu.fapi.roda;

public class FabricaRoda {

	public Roda fabricaRoda(double aro, String material) {
		return new Roda(aro, material);
		}
}
