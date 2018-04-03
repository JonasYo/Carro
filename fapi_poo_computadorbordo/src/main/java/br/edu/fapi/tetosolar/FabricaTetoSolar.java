package br.edu.fapi.tetosolar;

public class FabricaTetoSolar {
	
	public TetoSolar fabricarTetoSolar(double altura, double largura, double espessura,
			String material, String cor) {
		return new TetoSolar(altura, largura, espessura, material, cor);
	}

}
