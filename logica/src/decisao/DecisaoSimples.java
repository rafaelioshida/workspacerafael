package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float media = (nota1 + nota2)/2;
		if (media >= 6) {
			System.out.println("Parabens, voc� foi aprovado na disciplina: "  + disciplina);
		}
		
		if (media < 4) {
			System.out.println("Voc� foi reprovado na displina: " + disciplina);
		}
		
		// && => AND
		// || => OR
		if (media >=4 && media < 6 ) {
			System.out.println("Voc� ainda pode realizar o exame para tentar ser aprovado na disciplina: " + disciplina);
		}
		
		System.out.println("Media: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
