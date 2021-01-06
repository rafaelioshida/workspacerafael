package Lista2;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
	short diaria = Short.parseShort(JOptionPane.showInputDialog("Quantas diarias:"));
	float valor = (float) 80.00;
	float taxa = (float) 5.5;
	if (diaria < 15) {
		taxa = (float) 8;
	}else if (diaria == 15) {
		taxa = (float) 6;
	}
	System.out.println("O valor total da conta é:" + ((diaria * valor) + (diaria * taxa)));
	
	
	
	
	
	}

}
