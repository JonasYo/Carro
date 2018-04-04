package br.edu.fapi.carro;

import java.util.Scanner;

import br.edu.fapi.step.FabricaStep;
import br.edu.fapi.step.Step;
import br.edu.fapi.tetosolar.FabricaTetoSolar;
import br.edu.fapi.tetosolar.TetoSolar;

public class FabricaCarro {

	public Carro fabricarCarro() {
		System.out.println("Iniciando a fabricação do carro. Por favor responda seguintes perguntas: :)");
		
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("O seu carro irá possuir Teto Solar ? (Sim|Não)");
		String possuiTetoSolar = scanner.nextLine();
		if("Sim".equalsIgnoreCase(possuiTetoSolar)) {
			FabricaTetoSolar fabricaTetoSolar = new FabricaTetoSolar();
			double altura = scanner.nextDouble();
			double largura = scanner.nextDouble();
			double espessura = scanner.nextDouble();
			String material = scanner.nextLine();
			String cor = scanner.nextLine();
			TetoSolar tetoSolar = fabricaTetoSolar.fabricarTetoSolar(altura, largura, espessura, material, cor);
			
			carro.setTetoSolar(tetoSolar);
		}
		
		System.out.println("O seu carro irá possuir Step? (Sim|Não)");
		String possuiStep = scanner.nextLine();
		if ("Sim".equalsIgnoreCase(possuiStep)) {
			FabricaStep fabricaStep = new FabricaStep();
			double aro = scanner.nextDouble();
			double largura = scanner.nextDouble();
			double perfil = scanner.nextDouble();
			Step Step = fabricaStep.fabricaStep(aro, largura, perfil);
			
			carro.setStep(Step);
		}
		
		
		
			
		
		
		
		
		return carro;
	}
	
}
