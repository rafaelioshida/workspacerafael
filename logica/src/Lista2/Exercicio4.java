package Lista2;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insita um n�mero inteiro:"));
		int numero2= Integer.parseInt(JOptionPane.showInputDialog("Insita um segundo n�mero inteiro:"));
		if (numero2== numero) {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insita um n�mero inteiro diferente do primeiro numero:"));
		}
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insita um terceiro n�mero inteiro:"));
		if (numero3 == numero || numero3 == numero2) {
			numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insita um n�mero inteiro diferente do primeiro e do segundo numero:"));
		}
		
		if( ( numero > numero2 && numero > numero3 ) && ( numero2 > numero3 ) ) { //numero > numero2 > numero3
		    System.out.println(numero);
		    System.out.println(numero2);
		    System.out.println(numero3);
		}else if( ( numero > numero2 && numero > numero3 ) && ( numero3 > numero2 ) ) { // numero > numero3 > numero2
		    System.out.println(numero);
		    System.out.println(numero3);
		    System.out.println(numero2);
		}else if( ( numero2 > numero && numero2 > numero3 ) && ( numero > numero3 ) ) { //numero2 > numero > numero3
		    System.out.println(numero2);
		    System.out.println(numero);
		    System.out.println(numero3);
		}else if( ( numero2 > numero && numero2 > numero3 ) && ( numero3 > numero ) ) { // numero2 > numero3 > numero
		    System.out.println(numero2);
		    System.out.println(numero3);
		    System.out.println(numero);
		}else if( ( numero3 > numero && numero3 > numero2 ) && ( numero > numero2 ) ) { // numero3 > numero > numero2
		    System.out.println(numero3);
		    System.out.println(numero);
		    System.out.println(numero2);
		}else if( ( numero3 > numero && numero3 > numero2 ) && ( numero2 > numero ) ) { // numero3 > numero2 > numero
		    System.out.println(numero3);
		    System.out.println(numero2);
		    System.out.println(numero);
		}
		
		
		
		
	}

}