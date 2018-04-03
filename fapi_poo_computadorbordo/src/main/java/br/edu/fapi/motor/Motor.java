package br.edu.fapi.motor;

public class Motor {
	
	private double altura;
	private double largura;
	private String material;
	
	public Motor (double altura, double largura, String material) {
		this.altura = altura;
		this.largura = largura;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
