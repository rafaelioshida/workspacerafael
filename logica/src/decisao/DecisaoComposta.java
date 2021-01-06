package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float media = (nota1 + nota2)/2;
		if (media >= 6) {
			System.out.println("Parabens, você foi aprovado na disciplina: "  + disciplina);
		}else if (media < 4) {
			System.out.println("Você foi reprovado na displina: " + disciplina);
		}else  {
			System.out.println("Você ainda pode realizar o exame para tentar ser aprovado na disciplina: " + disciplina);
			
			// && => AND
			// || => OR
		}
		
		System.out.println("Media: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
