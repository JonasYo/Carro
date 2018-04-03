package br.edu.fapi.tetosolar;

public class TetoSolar {
	
	private double altura;
	private double largura;
	private double espessura;
	private String material;
	private String cor;
	
	public TetoSolar(double altura, double largura, double espessura,
		String material, String cor) {
		this.altura = altura;
		this.largura = largura;
		this.espessura = espessura;
		this.material = material;
		this.cor = cor;
	}


	public double getAltura() {
		return altura;
	}


	public double getLargura() {
		return largura;
	}


	public double getEspessura() {
		return espessura;
	}


	public String getMaterial() {
		return material;
	}


	public String getCor() {
		return cor;
	}
	
}
