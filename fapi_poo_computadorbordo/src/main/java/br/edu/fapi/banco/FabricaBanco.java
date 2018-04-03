package br.edu.fapi.banco;

public class FabricaBanco {
	
	public Banco fabricaBanco(String material, boolean alavanca, double altura, double largura) {
	return new Banco(material, alavanca, altura, largura);	
	}

}
