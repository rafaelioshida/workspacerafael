package Lista2;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insita um n�mero inteiro:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insita um n�mero inteiro:"));
		int numero3=0;
		char operacao = JOptionPane.showInputDialog("Digite a opera��o matem�tica de preferencia: +,-,* ou /:").charAt(0);
		// String operacao = JOptionPane.showInputDialog("Digite a opera��o matem�tica de preferencia: +,-,* ou /:");
		if (operacao == '+') {
		//if(operacao.equals("+")){
			numero3 = numero + numero2;
		}else if (operacao == '-'){
			numero3 =  numero - numero2;
		}else if (operacao == '*') {
			numero3 =  numero * numero2;
		}else if (operacao == '/') {
			if(numero2 != 0) {
				numero3 = numero / numero2;
			}
			numero3 =  numero / numero2;		
		}else {
			System.out.println("Operador invalido");
		}
		System.out.println("O resultado da opera��o �:" +  numero3 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
