package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
 /*
  * Sintaxe do for
  * 1� definimos o contador e valor inicial
  * 2� condi��o (enquanto for verdadeiro o la�o ira continuar)
  * 3� como ocorrer� a contagem 
  */
		
	/*for ( int contador=0; contador<5;contador++) {
		System.out.println(contador);
	}*/
		
	int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada?"));
	for (int contador = 1; contador < 11 ; contador ++ ) {
		System.out.println(tabuada + " x " +  contador + " = " + (tabuada * contador));
	}
	
	
	
	
	
	}

}