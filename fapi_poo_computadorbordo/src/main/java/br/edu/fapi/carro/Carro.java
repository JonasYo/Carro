package br.edu.fapi.carro;

import br.edu.fapi.banco.Banco;
import br.edu.fapi.motor.Motor;
import br.edu.fapi.pneu.Pneu;
import br.edu.fapi.roda.Roda;
import br.edu.fapi.step.Step;
import br.edu.fapi.tanquegasolina.Tanque;
import br.edu.fapi.tetosolar.TetoSolar;

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
	
	private Step step;

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
	}
	
	private Roda roda;

	public Roda getRoda() {
		return roda;
	}

	public void setRoda(Roda roda) {
		this.roda = roda;
	}
	
	private Pneu pneu;

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	private Banco banco;

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
			
}
