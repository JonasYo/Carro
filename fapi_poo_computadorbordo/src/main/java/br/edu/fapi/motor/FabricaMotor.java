package br.edu.fapi.motor;

public class FabricaMotor {

	public Motor fabricaMotor(double altura, double largura, String material) {
		return new Motor(altura, largura, material);
	}


}
