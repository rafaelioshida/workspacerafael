package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Produto;

public class AplicaçãoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Produto produto = new Produto();
		produto.setId(123);
		produto.setDescricao("cerveja");
		produto.setQtde(10);
		produto.setValorCompra(5);
		produto.setValorVenda(7);
		
		/*
		 * Também pode ser usada a função setAll:
		 * 			produto.setAll(
		 * 				Integer.parseInt(JOptionPane.showInputDialog("Codigo")),
		 * 				JOptionPane.showInputDialog("Descrição"),
		 * 				Float.parseFloat(JOptionPane.showInputDialog("Valor de venda")),
		 * 				Float.parseFloat(JOptionPane.showInputDialog("Valor de compra")),
		 * 				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
		 * 				);
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println(produto.getAll());
		
		
		
		
		
		
		
		
		
		
		
	}

}
