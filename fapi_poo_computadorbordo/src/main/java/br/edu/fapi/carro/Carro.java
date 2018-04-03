package br.edu.fapi.carro;

import br.edu.fapi.tetosolar.TetoSolar;
import br.edu.fapi.tanquegasolina.Tanque;

public class Carro {

	private TetoSolar tetoSolar;

	public TetoSolar getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(TetoSolar tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	private Tanque tanqueGasolina;

	public Tanque getTanqueGasolina() {
		return tanqueGasolina;
	}

	public void setTanqueGasolina(Tanque tanqueGasolina) {
		this.tanqueGasolina = tanqueGasolina;
	}
		
}
