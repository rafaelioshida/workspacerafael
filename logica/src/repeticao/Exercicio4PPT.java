package repeticao;

import javax.swing.JOptionPane;

public class Exercicio4PPT {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas. 
		 * A aplicação continuará perguntando nome e idade enquanto o usuário afirmar que deseja continuar.
		 * Ao terminar, a aplicação deverá exibir:
		 * - a quantidade de pessoas maiores de idade e
		 * - a média entre todas as idades que foram digitadas.
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
				
			
		JOptionPane.showMessageDialog(null, "O número de pessoa(s) maior de idade é:" + qtdeMaior);
		JOptionPane.showMessageDialog(null, "A média de idade é:" + media);
		JOptionPane.showMessageDialog(null, "A pessoa mais experiente é:" + nomeExperiente + "com idade de " + idadeExperiente + " anos.");
		JOptionPane.showMessageDialog(null, "A pessoa mais jovem é:" + nomeJovem + " com idade de " + idadeJovem);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
