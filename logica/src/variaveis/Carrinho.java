package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {

		/*
		 * nome do produto
		 * categoria do produto
		 * valor do produto
		 * quantidade do produto
		 * imposto do produto
		 */
		
		
		String nomeProduto=JOptionPane.showInputDialog("Digite o nome do produto");
		String categoriaProduto=JOptionPane.showInputDialog("Digite a categoria do produto");
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		int qtdeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
		double impostoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto do produto"));
		
		
		/*
		 * total sem imposto
		 * total com imposto
		 * valor do imposto sobre o valor do produto
		 * total com imposto e 10% de desconto
		 */
		
		double valorTotal = valorProduto * qtdeProduto;
		double totalImposto = valorTotal + (valorTotal * (impostoProduto / 100));
		double imposto = valorProduto * impostoProduto / 100;
		double totalImpostoDesc = totalImposto * 0.9;
		
		System.out.println("Nome:      " + nomeProduto);
		System.out.println("Categoria: " + categoriaProduto);
		System.out.println("Valor:   R$" + valorProduto);
		System.out.println("Quantidade:" + qtdeProduto + " unidade(s)");
		System.out.println("Imposto:   " + impostoProduto + "%");
		
		System.out.println("Valor total:                R$" + valorTotal);
		System.out.println("Total com imposto:          R$" + totalImposto);
		System.out.println("Imposto:                    R$" + imposto);
		System.out.println("Total com 10% desc a vista: R$" + totalImpostoDesc);
		
		
		
		
		
	}

}
