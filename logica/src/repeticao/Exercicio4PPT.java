package repeticao;

import javax.swing.JOptionPane;

public class Exercicio4PPT {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas. 
		 * A aplica��o continuar� perguntando nome e idade enquanto o usu�rio afirmar que deseja continuar.
		 * Ao terminar, a aplica��o dever� exibir:
		 * - a quantidade de pessoas maiores de idade e
		 * - a m�dia entre todas as idades que foram digitadas.
		 *  - a pessoa mais experiente (nome e idade)
		 *  - a pessoa mais jovem (nome e idade)
		 */

		String nome = "";
		short idade = 0;
		short qtdeMaior = 0;
		short qtdePessoas = 0;
		short somaIdade = 0;
		double media = 0;
		short idadeExperiente = 0;
		String nomeExperiente = "";
		short idadeJovem = 0;
		String nomeJovem = "";
		
		do {
			nome = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade: "));
			if (idade >= 18) {
				qtdeMaior ++;
			}
			somaIdade += idade;
			qtdePessoas ++;
			media = somaIdade / qtdePessoas ;
			
			if (idade > idadeExperiente) {
				idadeExperiente = idade;
				nomeExperiente = nome;
			}
			if (idade < idadeJovem ||qtdePessoas ==1 ) {
				idadeJovem = idade;
				nomeJovem = nome;
			}
		}while(JOptionPane.showConfirmDialog(null, "Continuar?" , "Pergunta", JOptionPane.YES_NO_OPTION) == 0);
				
			
		JOptionPane.showMessageDialog(null, "O n�mero de pessoa(s) maior de idade �:" + qtdeMaior);
		JOptionPane.showMessageDialog(null, "A m�dia de idade �:" + media);
		JOptionPane.showMessageDialog(null, "A pessoa mais experiente �:" + nomeExperiente + "com idade de " + idadeExperiente + " anos.");
		JOptionPane.showMessageDialog(null, "A pessoa mais jovem �:" + nomeJovem + " com idade de " + idadeJovem);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
