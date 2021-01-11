package br.com.ecommerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.ClientePF;
import br.com.ecommerceabc.modelo.ClientePJ;
import br.com.ecommerceabc.modelo.Colaborador;
import br.com.ecommerceabc.modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		char resp = JOptionPane.showInputDialog("Digite: F para Pessoa Fisica \n J para Pessoa Juridica \n C para Colaborador \n").toUpperCase().charAt(0);
		if (resp =='F') {
			pessoa = new ClientePF();
		}else if (resp == 'J') {
			pessoa = new ClientePJ();
		}else if (resp =='C') {
			pessoa = new Colaborador();
		}else {
			System.out.println("Opção invalida");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
