package br.com.elevadores.aplicacao;

import br.com.elevadores.modelo.Elevadores;

public class AplicacaoElevadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um objeto = ele não possui qualquer repartição
		*Exemplo: Veiculo objeto;
		*Instanciar um objeyo => ele possui todas as repartições
		*Exemplo: Veiculo objeto = new Veiculo();
		*/
		
		Elevadores objeto = new Elevadores();
		objeto.inicializar((short) 10,(short) 15, (short) 0);
		
		
		System.out.println(objeto.verificarStatus());
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.entrar((short)9);
		objeto.subir();
		
		
		
		System.out.println(objeto.verificarStatus());

		
		
		
		
		
		
		
		
		
	}

}
