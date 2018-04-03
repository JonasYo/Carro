package br.edu.fapi.roda;

public class Roda {
	private double aro;
	private String material;
	
	public Roda ( double aro, String material) {
		this.aro = aro;
		this.material = material;
	}

	public double getAro() {
		return aro;
	}

	public void setAro(double aro) {
		this.aro = aro;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
