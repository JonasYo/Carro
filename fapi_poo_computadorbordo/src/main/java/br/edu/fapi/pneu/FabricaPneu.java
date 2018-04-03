package br.edu.fapi.pneu;

public class FabricaPneu {
	
	public Pneu fabricaPneu(double aro, double largura, double perfil, String material) {
		return new Pneu(aro, largura, perfil, material);
	}

}
