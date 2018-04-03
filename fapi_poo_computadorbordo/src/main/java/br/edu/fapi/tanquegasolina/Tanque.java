package br.edu.fapi.tanquegasolina;

public class Tanque {
	private double capacidade;
	private double altura;
	private double largura;
	
	public Tanque (double capacidade, double altura, double largura) {
		this.capacidade = capacidade;
		this.altura = altura;
		this.largura = largura;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
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
