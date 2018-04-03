package br.edu.fapi.carro;

import java.util.Scanner;

import br.edu.fapi.tetosolar.FabricaTetoSolar;
import br.edu.fapi.tetosolar.TetoSolar;

public class FabricaCarro {

	public Carro fabricarCarro() {
		System.out.println("Iniciando fabricação do carro :)");
		
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("O seu carro possui teto solar ? (sim|nao)");
		String possuiTetoSolar = scanner.nextLine();
		if("sim".equalsIgnoreCase(possuiTetoSolar)) {
			FabricaTetoSolar fabricaTetoSolar = new FabricaTetoSolar();
			double altura = scanner.nextDouble();
			double largura = scanner.nextDouble();
			double espessura = scanner.nextDouble();
			String material = scanner.nextLine();
			String cor = scanner.nextLine();
			TetoSolar tetoSolar = fabricaTetoSolar.fabricarTetoSolar(altura, largura, espessura, material, cor);
			
			carro.setTetoSolar(tetoSolar);
			
			
			
			
		}
		
		
		
		return carro;
	}
	
}
