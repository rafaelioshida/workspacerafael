package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
/*
 * input: produto, qtde, valor unitario
 * preciso avliiar o estoque:
 * se qtde 10-20 =>valor unitario 10% de redu��o
 * se qtde 5-9 =>valor unitario 5% de redu��o
 * se qtde <5 =>sem redu��o
 * se qtde >20 =>valor valor unitario com 12% de redu��o
 * 
 */
		
	String produto = JOptionPane.showInputDialog("Produto:");	
	float qtde = Float.parseFloat(JOptionPane.showInputDialog("Quantidade:"));
	float valoruni = Float.parseFloat(JOptionPane.showInputDialog("Valor unit�rio:"));
	
	
	if  (qtde > 20) {
		valoruni = valoruni * (float) 0.88;
		//System.out.println("Valor do produto " + produto + " �: R$" + valoruni);
	}else if (qtde >= 5 && qtde <=9) {
		valoruni = valoruni * (float) 0.95;
		//System.out.println("Valor do produto " + produto + " �: R$" + valoruni);
	}else if (qtde >= 10 && qtde <=20){
		valoruni = valoruni * (float) 0.9;
		//System.out.println("Valor do produto " + produto + " �: R$" + valoruni);
	}
	System.out.println("Valor do produto " + produto + " �: R$" + valoruni);

		
	}

}
