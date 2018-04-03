package br.edu.fapi.pneu;

public class Pneu {

	private double aro;
	private double largura;
	private double perfil;
	private String material;
	
	public Pneu (double aro, double largura, double perfil, String material) {
		this.aro = aro;
		this.largura = largura;
		this.perfil = perfil;
		this.material = material;
	}

	public double getAro() {
		return aro;
	}

	public void setAro(double aro) {
		this.aro = aro;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getPerfil() {
		return perfil;
	}

	public void setPerfil(double perfil) {
		this.perfil = perfil;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
