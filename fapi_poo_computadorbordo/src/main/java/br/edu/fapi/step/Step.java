package br.edu.fapi.step;

public class Step {
	private double aro;
	private double largura;
	private double perfil;
	
	public Step (double aro,double largura, double perfil) {
		this.aro = aro;
		this.largura = largura;
		this.perfil = perfil;
		
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
	
}
