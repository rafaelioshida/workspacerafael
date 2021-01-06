package repeticao;

import javax.swing.JOptionPane;

public class Exerc1PPT {

	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia: "));
		
		do {
				JOptionPane.showMessageDialog(null, "Digite um dia valido, entre 1 e 31");
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia: "));
			
		}while(dia >=32 || dia <=0);
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes: "));
		do {
				JOptionPane.showMessageDialog(null, "Digite um mes valido, entre 1 e 12.");
				mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes: "));
			
		}while(mes >=13 || mes <=0);
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));
		do {
				JOptionPane.showMessageDialog(null, "Digite um ano valido, entre 0 e 2021");
				ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));		
		}while(ano >2021 || ano <=0);
		
		
		JOptionPane.showMessageDialog(null, "A data digitada é:" + dia + "/" + mes + "/" + ano + ".");
		
		
	}

}
