package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Pessoa;
import br.com.ecommerceabc.modelo.Endereco;

public class AplicacaoCliente {

	public static void main(String[] args) {

		Pessoa cliente = new Pessoa();
		cliente.setId(1);
		cliente.setNome("XPTO");
		cliente.setEmail("teste@teste2.com");
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLogradouro("testeend");
		endereco.setBairo("bairo");
		endereco.setCidade("cidade");
		endereco.setCep("cep");
		endereco.setNumero("numero");
		endereco.setComplemento("complemento");
		endereco.setUf("UF");
		System.out.println(cliente.toString());
		
		
		
		
		
		
	}

}
