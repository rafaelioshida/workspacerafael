package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
/*
 * Jogador 1 digita um numero
 * Jogador 2 tenta adivinhar o numero do jogador 1
 * Quando acertar mostra a mensagem de "Parabens"
 * 
 * implemente dica para o jogador 2
 * "N�mero � maior" e "N�mero � menor"
 * 
 * Quantas tentativas o jogador 2 utilizou para acertar
 * mensagem de parabens com o numero de tentativas
 * 
 */
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um n�mero: "));
		int tentativa = 0;
		int chutes = 0;
				
		do {
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, adivinhe o num�ro do jogador 1: "));
			if (numero > tentativa) {
				JOptionPane.showMessageDialog(null, "Voc� n�o acertou, o numero do jogador 1 � MAIOR do que o digitado");	
			}
			else if (numero < tentativa) {
				JOptionPane.showMessageDialog(null, "Voc� n�o acertou, o numero do jogador 1 � MENOR do que o digitado");	
			}
			chutes = chutes+1;
		}while(numero != tentativa);
			
		JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou em " + chutes + " tentativa(s)");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
