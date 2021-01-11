package br.com.ecommerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.Pessoa;
import br.com.ecommerceabc.modelo.Endereco;

public class AplicacaoCliente2 {

	public static void main(String[] args) {

		Pessoa cliente = new Pessoa (
				Integer.parseInt(JOptionPane.showInputDialog("Codigo")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("Email"),
				new Endereco(
						JOptionPane.showInputDialog("Logradouro"),
						JOptionPane.showInputDialog("Bairro"),
						JOptionPane.showInputDialog("Cidade"),
						JOptionPane.showInputDialog("UF"),
						JOptionPane.showInputDialog("CEP"),
						JOptionPane.showInputDialog("Numero"),
						JOptionPane.showInputDialog("Complemento")						
						)
				);
		
		System.out.println(cliente.toString());
		
		System.out.println(cliente.getEndereco().getBairo());
		
		
		
		
	}

}
