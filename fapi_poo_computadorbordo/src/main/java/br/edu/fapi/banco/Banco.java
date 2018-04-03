package br.edu.fapi.banco;

public class Banco {
	private String material;
	private boolean alavanca;
	private double altura;
	private double largura;
	
	public Banco (String material, boolean alavanca, double altura, double largura) {
		this.material = material;
		this.alavanca = alavanca;
		this.altura = altura;
		this.largura = largura;
}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isAlavanca() {
		return alavanca;
	}

	public void setAlavanca(boolean alavanca) {
		this.alavanca = alavanca;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
		
}