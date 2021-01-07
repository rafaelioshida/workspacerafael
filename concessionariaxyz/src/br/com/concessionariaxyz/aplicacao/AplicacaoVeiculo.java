package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		/*Criar um objeto = ele não possui qualquer repartição
		*Exemplo: Veiculo objeto;
		*Instanciar um objeyo => ele possui todas as repartições
		*Exemplo: Veiculo objeto = new Veiculo();
		*/
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("FiaT");
		objeto.preencherModelo("palio");
		objeto.preencherVelocidadeMaxima(100);
		objeto.preencherValor(15100);

		System.out.println("Montadora:         "+objeto.retornarMontadora());
		System.out.println("Modelo:            "+objeto.retornarModelo());
		System.out.println("Valocidade Maxima: "+objeto.retornarVelocidadeMaxima() + "km/h");
		System.out.println("Valor:          R$ "+objeto.retornarValor());

		
		System.out.println(objeto.ligar());
		
		objeto.acelerar();
		objeto.acelerar();
		objeto.acelerar();
		
		System.out.println(objeto.verificarStatus());
		
		objeto.desacelerar();
		objeto.desacelerar();	
		
		System.out.println(objeto.verificarStatus());
		
		System.out.println(objeto.desligar());
		
		System.out.println(objeto.verificarStatus());

		objeto.desacelerar();
		
		System.out.println(objeto.verificarStatus());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
