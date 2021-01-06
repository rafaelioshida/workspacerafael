package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Acrescentar faltas 
		 * Aprovação => media e falta < 20
		 * Exame => media e falta <20
		 * Falta >=20 => reprovado
		 */		
		
		String disciplina = JOptionPane.showInputDialog("Disciplina:");
		short  faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas:"));
		if (faltas >= 20) {
			System.out.println("Você foi reprovado por faltas na displina: " + disciplina);
		}else {		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2:"));
		float media = (nota1 + nota2)/2;
		if (media >= 6) {
			System.out.println("Parabens, você foi aprovado na disciplina: "  + disciplina);
		}else if (media < 4) {
			System.out.println("Você foi reprovado na displina: " + disciplina);
		}else  {
			System.out.println("Você ainda pode realizar o exame para tentar ser aprovado na disciplina: " + disciplina);
			}
		System.out.println("Media: " + media);}
		
		
	}

}
