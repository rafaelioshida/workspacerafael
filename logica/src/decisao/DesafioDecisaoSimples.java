package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {

		/*
		 * input nome e idade
		 * msg:
		 * se maior que 70 ou 16 ou 17 => voto facultativo
		 * se menor que 16 anos => não vota
		 * se estiver entre 18 e 70 =>obrigado a votar 
		 */
		
		String nome = JOptionPane.showInputDialog("Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		
		if (idade > 70 || idade == 16 || idade == 17) {
			System.out.println("Voto facultativo");
		}
		
		if (idade < 16) {
				System.out.println("Não vota");
		}
		
		if (idade >=18 && idade <=70) {
			System.out.println("Voto obrigatório");
		}
		
		
		
		
		
		
	}

}
