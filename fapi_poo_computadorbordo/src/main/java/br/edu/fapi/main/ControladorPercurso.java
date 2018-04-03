package br.edu.fapi.main;

import br.edu.fapi.carro.Carro;
import br.edu.fapi.carro.FabricaCarro;

public class ControladorPercurso {

	public void iniciar() {
		FabricaCarro fabricaCarro = new FabricaCarro();
		Carro carro = fabricaCarro.fabricarCarro();
		
		if(carro != null) {
			iniciarPercurso(carro);
		}else {
			System.out.println("Carro nao criado. Fabrica com problemas :(");
		}
		
	}
	
	private void iniciarPercurso(Carro carro) {
		//Aqui acontecem as verificacoes.
	}
	

}
