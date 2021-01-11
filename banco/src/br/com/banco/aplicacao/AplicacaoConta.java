package br.com.banco.aplicacao;

import br.com.banco.modelo.Agencia;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Gerente;
import br.com.banco.util.Magica;

public class AplicacaoConta {
	
		

	public static void main(String[] args) {

		
		Conta conta = new Conta(
		Magica.i("Numero conta"),
		Magica.f("Saldo"),
		new Cliente (
				(int) 10,
				"Nome cliente",
				"Email",
				new Endereco(
						Magica.s("Logradouro cliente"),
						Magica.s("Bairro cliente"),
						Magica.s("Cidade cliente"),
						Magica.s("UF cliente"),
						Magica.s("CEP cliente"),
						Magica.s("Numero casa cliente"),
						Magica.s("Complemento cliente"))),
		new Agencia (
				Magica.s("Nome agencia"),
				Magica.i("Numero agencia"),
				new Endereco(
						Magica.s("Logradouro agencia"),
						Magica.s("Bairro agencia"),
						Magica.s("Cidade agencia"),
						Magica.s("UF agencia"),
						Magica.s("CEP agencia"),
						Magica.s("Numero agencia"),
						Magica.s("Complemento agencia")),	
				Magica.s("Telefone"),
				Magica.i("ID")),
		new Gerente(
				Magica.s("Nome gerente"),
				Magica.s("Telefone gerente"),
				Magica.s("Email gerente"),
				Magica.i("Funcional gerente")

		)
		)
				;
		System.out.println(conta.getSaldo());
		System.out.println(conta.getCliente().getNome());
		System.out.println(conta.getCliente().getEndereco().getCidade());
		System.out.println(conta.getGerente().getNome());
		System.out.println(conta.getAgencia().getNome());

		
		
		
		
		
		
		
		
		
		
		
	}

}
