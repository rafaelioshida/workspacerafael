package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Magica;
import br.com.bankofoz.modelo.Poupanca;

public class ImplementarConta {

	
	public static void main (String[] args) {
		
		Conta conta = null;
		
		char resp = JOptionPane.showInputDialog("Digite <1> para conta corrente").charAt(0);
		if(resp=='1') {
			conta = new Corrente(
					(short) Magica.i("Código cliente"),
					(byte) Magica.i ("Digito"),
					(short) Magica.i("Agencia"),
					0,
					new Cliente(
							Magica.i("codigo"),
							Magica.s("Nome"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Limite"),
					Magica.f("Taxa")					
					);
			
			
		}else {
			conta = new Poupanca(
					(short) Magica.i("Código cliente"),
					(byte) Magica.i ("Digito"),
					(short) Magica.i("Agencia"),
					0,
					new Cliente(
							Magica.i("codigo"),
							Magica.s("Nome"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Rendimento")
					);
			
			
			
			
			
			
			
		}
		
				
		
		
		
		
		
		System.out.println(conta.depositar(Magica.f("valor depositado")));
		System.out.println(conta.toString());
		System.out.println(conta.sacar(Magica.f("Sacar")));
		
		
		
		
	}
}
